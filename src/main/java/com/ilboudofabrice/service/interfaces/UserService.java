package com.ilboudofabrice.service.interfaces;

import com.ilboudofabrice.domain.User;

import java.util.List;

/**
 * Created by filboudo on 2017-02-16.
 */
public interface UserService {
    void addUser();
    void deleteUser(String id);
    void removeUser(String id);
    void updateLoginAndPassword(String login, String password);
    void updatePassword(String password);
    void updateAppAccess(List<String> appAccesses);
    User findUserByCredentials(String login, String password);

}
