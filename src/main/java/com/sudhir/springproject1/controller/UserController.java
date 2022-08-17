package com.sudhir.springproject1.controller;

import com.sudhir.springproject1.entity.User;
import com.sudhir.springproject1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users" , produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
   private UserService userService;

    @GetMapping("/")
    public List<User> hello() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user) {
        userService.AddUser(user);
        return user;
    }


}
