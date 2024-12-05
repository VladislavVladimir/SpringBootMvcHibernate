package org.example.springbootmvchibernate.services;

import org.example.springbootmvchibernate.dao.UserDao;
import org.example.springbootmvchibernate.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userDao.getReferenceById(id);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public void saveOrUpdateUser(User user) {
        userDao.save(user);
    }
}
