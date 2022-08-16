package com.sudhir.springproject1.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users" , produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
