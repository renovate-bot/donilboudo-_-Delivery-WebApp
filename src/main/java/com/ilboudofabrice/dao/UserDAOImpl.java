package com.ilboudofabrice.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ilboudofabrice.dao.interfaces.UserDAO;
import com.ilboudofabrice.domain.User;

/**
 * Created by filboudo on 2017-02-16.
 */
@Repository
public class UserDAOImpl implements UserDAO{
    public void addUser(User user) {

    }

    public void removeUser(String userId) {

    }

    public void updateUser(User user) {

    }

    public List<User> getUsers() {
        return null;
    }

    public User findUserById(String id) {
        return null;
    }

    public User findUserByName(String name) {
        return null;
    }
}
