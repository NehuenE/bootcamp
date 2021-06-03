package com.Nehuen_Elizeche.topic_5_f.repository;

import com.Nehuen_Elizeche.topic_5_f.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends CrudRepository<User, Integer> {



}
