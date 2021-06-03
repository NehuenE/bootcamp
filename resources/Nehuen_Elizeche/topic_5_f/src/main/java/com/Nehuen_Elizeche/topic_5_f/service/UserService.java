package com.Nehuen_Elizeche.topic_5_f.service;


import com.Nehuen_Elizeche.topic_5_f.model.User;
import com.Nehuen_Elizeche.topic_5_f.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
public class UserService {

    private UserRepository userRepository;
    @Autowired
    public UserService (UserRepository  userRepository){this.userRepository= userRepository;}

    public void deleteUser(@PathVariable("id")Integer userid ) {
        boolean exists= userRepository.existsById(userid);
        if(!exists){
            throw  new IllegalStateException(
                    "user with id" + userid + "does not exists");
        }

        userRepository.deleteById(userid);
    }

    public void addNewUser(String name, String email) {
       if(name != null &&
                name.length() > 0 ){
           if (email != null &&
                   email.length() > 0 ) {

               User n = new User();
               n.setName(name);
               n.setEmail(email);
               userRepository.save(n);
           }
       }

    }
    @Transactional
    public void updateUser(Integer userid, String name, String email) {
        User user = userRepository.findById(userid).orElseThrow(() ->  new IllegalStateException(
                "user with id" +userid+ "does not exist"
        ));
        if (name != null && name.length() >0 &&
                    !Objects.equals(user.getName(), name)){
            user.setName(name);
        }
        if (email != null && email.length() >0 &&
                !Objects.equals(user.getEmail(), email)){
            user.setEmail(email);
        }

    }
}
