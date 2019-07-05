package com.chae.web.repositories;

import com.chae.web.entityes.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    public User findByUserIdAndPassword(String userId,String password);
}