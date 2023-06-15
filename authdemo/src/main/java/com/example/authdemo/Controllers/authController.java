package com.example.authdemo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.authdemo.authRepo;
import com.example.authdemo.Models.loginmodel;
import com.example.authdemo.Models.user;

@RestController
public class authController {
    @Autowired
    authRepo repo;

    @GetMapping("/")
    public String start() {
        return "Application Started";
    }

    @PostMapping("/auth/register")
    public String register(@RequestBody user u) {
        // store user in db
        repo.insert(u);
        return "Registered user successfully";
    }

    @PostMapping("/auth/login")
    public String login(@RequestBody loginmodel login) {
        // check user in db
        return "Login user successfully";
    }
}
