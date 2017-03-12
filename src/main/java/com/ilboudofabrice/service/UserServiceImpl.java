package com.ilboudofabrice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ilboudofabrice.dao.interfaces.UserDAO;
import com.ilboudofabrice.domain.User;
import com.ilboudofabrice.service.interfaces.UserService;

/**
 * Created by filboudo on 2017-02-16.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    public void addUser(String firstName, String lastName, String email, String phone, String login, String password, List<String> appAccesses) {
        User user = new User(firstName, lastName, email, phone, login, password);
        userDAO.addUser(user);
    }

    @Transactional
    public void deleteUser(String userId) {
        userDAO.deleteUser(userId);
    }

    @Transactional
    public void updateLoginAndPassword(String userId, String login, String password) {
        userDAO.updateLoginAndPassword(userId, login, password);
    }

    @Transactional
    public void updatePassword(String userId, String password) {
        userDAO.updatePassword(userId, password);
    }

    @Transactional
    public void updateAppAccess(List<String> appAccesses) {

    }

    @Transactional
    public User findUserByCredentials(String userName, String password) {
        return userDAO.findUserByCredentials(userName, password);
    }

    @Transactional
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    public boolean isValidUser(String userName, String password) {
        return userDAO.isValidUser(userName, password);
    }

    public User findUserById(String userId) {
        return userDAO.findUserById(userId);
    }
}
