package com.ilboudofabrice.service.interfaces;

import com.ilboudofabrice.domain.User;

/**
 * Created by filboudo on 2017-03-10.
 */
public interface LoginService {
    String login(User user);

    boolean isLogin(String sessionId);

    void logout(String sessionId);

    boolean isValidSession(String userSessionId);
}
