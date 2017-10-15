package com.saponko.persistance.UsersDao;

import com.saponko.persistance.users.User;

import java.util.List;

public interface UserDao {
    List<User> loadAllUsers();
    void saveUser(User user);
}
