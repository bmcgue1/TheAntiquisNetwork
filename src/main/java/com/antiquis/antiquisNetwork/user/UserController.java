package com.antiquis.antiquisNetwork.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(UserService userService,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    //Adds Users
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/sign-up")
    public void signUp(@RequestBody User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.addUsers(user);
    }

    //Get all users
    @GetMapping("/getAll")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    //Find user By ID
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/name/{name}")
    public User getUserByUserName(@PathVariable String name) {
        return userService.findUserByName(name);
    }

    //Delete user
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }


}

