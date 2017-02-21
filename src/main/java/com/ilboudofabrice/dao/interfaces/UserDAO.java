package com.ilboudofabrice.dao.interfaces;

import java.util.List;

import com.ilboudofabrice.domain.User;

/**
 * Created by filboudo on 2017-02-16.
 */
public interface UserDAO {
    void addUser(User user);
    void removeUser(String userId);
    void updateUser(User user);
    List<User> getUsers();
    User findUserById(String id);
    User findUserByName(String name);
}
