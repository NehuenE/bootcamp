package com.Nehuen_Elizeche.topic_5_f.controller;

import com.Nehuen_Elizeche.topic_5_f.model.User;
import com.Nehuen_Elizeche.topic_5_f.repository.UserRepository;
import com.Nehuen_Elizeche.topic_5_f.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(path= "/User")
public class UserController {

    private final UserService userService;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
    @PostMapping(path="/add")
    public void addNewUser (@RequestParam String name,@RequestParam String email  ){
      userService.addNewUser(name, email);

    }
    @PutMapping("/update/{userid}")
    public void updateUser(
            @PathVariable ("userid")Integer id,
            @RequestParam String name,
            @RequestParam String email) {
        userService.updateUser(id, name, email);
    }


    @DeleteMapping(path="/del/{id}")
    public void deleteUser(@PathVariable ("id") Integer userid){

        userService.deleteUser(userid);
        }

}

