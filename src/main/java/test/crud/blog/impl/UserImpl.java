package test.crud.blog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.crud.blog.dao.UserDao;
import test.crud.blog.definition.UserDefinition;
import test.crud.blog.entity.User;

import java.util.List;

@Service
public class UserImpl implements UserDefinition {

    @Autowired
    UserDao userDao;

    @Override
    public User saveUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserDataByCreds(String email, String password) {
        return userDao.getUserByEmailAndPassword(email, password);
    }

    @Override
    public User updateUserInfo(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserInfo(Long uid) {
        return userDao.getUserByUid(uid);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }
}
