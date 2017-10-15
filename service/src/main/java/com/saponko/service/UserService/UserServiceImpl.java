package com.saponko.service.UserService;

import com.saponko.persistance.UsersDao.UserDao;
import com.saponko.persistance.users.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class UserServiceImpl implements UserService {

    @Resource(name = "userDaoImpl")
    private UserDao dao;

    @Override
    public List<User> getAllUsers() {
        return dao.loadAllUsers();
    }

    @Override
    public void addSingleUser(User user) {
        dao.saveUser(user);
    }
}
