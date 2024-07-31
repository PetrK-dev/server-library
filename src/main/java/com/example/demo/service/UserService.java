package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.Collection;
import java.util.Optional;

public interface UserService extends CrudService<User, Long>{
    Optional<User> getUserByUsername(String username);
    Optional<User> getUserByEmail(String email);
    Collection<User> getUsersByRoleName(String roleName);
}