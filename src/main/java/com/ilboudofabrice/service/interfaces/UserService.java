package com.ilboudofabrice.service.interfaces;

import com.ilboudofabrice.domain.User;

import java.util.List;

/**
 * Created by filboudo on 2017-02-16.
 */
public interface UserService {
    void addUser(String firstName, String lastName, String email, String phone, String login, String password, List<String> appAccesses);

    void deleteUser(String userId);

    void updateLoginAndPassword(String userId, String login, String password);

    void updatePassword(String userId, String password);

    void updateAppAccess(List<String> appAccesses);

    User findUserByCredentials(String userName, String password);

    List<User> getUsers();

    boolean isValidUser(String userName, String password);

    User findUserById(String userId);
}
