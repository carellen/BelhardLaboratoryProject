package com.saponko.persistance.UsersDao;

import com.saponko.persistance.repositories.UserRepository;
import com.saponko.persistance.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserDaoImpl implements UserDao{

    @Resource(name = "userRepository")
    private UserRepository repository;


    @Override
    public List<User> loadAllUsers() {
        List<User> users = new ArrayList<>();
        repository.findAll()
                .forEach(users::add);
        return users;
    }

    @Override
    public void saveUser(User user) {
        repository.save(user);
    }

}
