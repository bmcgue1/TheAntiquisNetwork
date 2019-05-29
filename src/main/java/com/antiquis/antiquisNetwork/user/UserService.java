package com.antiquis.antiquisNetwork.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Get all users
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    //User by id
    public Optional<User> getUser(Long id) {
        Optional<User> byId = userRepository.findById(id);
        return byId;
    }

    //Add User
    public void addUsers(User user) {
        userRepository.save(user);
    }

    //Find user by username
    public User findUserByName(String name) {
        return userRepository.findByUsername(name);
    }

    // TODO :Fix update users
    public void updateUser(Long id, User user) {
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
