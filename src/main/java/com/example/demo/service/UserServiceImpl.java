package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl extends CrudServiceImpl<User, Long> implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Collection<User> getUsersByRoleName(String roleName) {
        return userRepository.findByRoles_Name(roleName);
    }

    @Override
    public User update(Long id, User userDetails) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUsername(userDetails.getUsername());
            user.setPassword(userDetails.getPassword());
            user.setEmail(userDetails.getEmail());
            user.setRoles(userDetails.getRoles());
            user.setBorrowedBooks(userDetails.getBorrowedBooks());
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    @Override
    protected CrudRepository<User, Long> getRepository() {
        return this.userRepository;
    }
}
