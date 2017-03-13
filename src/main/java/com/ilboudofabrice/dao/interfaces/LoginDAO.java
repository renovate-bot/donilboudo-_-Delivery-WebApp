package com.ilboudofabrice.dao.interfaces;

import com.ilboudofabrice.domain.User;

/**
 * Created by filboudo on 2017-03-10.
 */
public interface LoginDAO {
    void login(String sessionId, User user);

    boolean isLogin(String sessionId);

    void logout(String sessionId);

    boolean isValidSession(String userSessionId);
}
