package com.saponko.service.UserService;

import com.saponko.persistance.users.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addSingleUser(User user);
}
