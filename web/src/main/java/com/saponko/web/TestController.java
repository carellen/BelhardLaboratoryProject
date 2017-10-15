package com.saponko.web;

import com.saponko.persistance.users.User;
import com.saponko.service.UserService.UserService;
import com.saponko.service.UserService.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private UserService service;

    @GetMapping("/all")
    public List<User> getUsers() {
        return service.getAllUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        service.addSingleUser(user);
    }

}
