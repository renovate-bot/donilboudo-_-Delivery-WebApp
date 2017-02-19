package com.ilboudofabrice.controller;

import com.ilboudofabrice.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class UserController {
    private static String NEW_USER_PAGE = "newUser";

    @RequestMapping(path = "/newUser")
    public String newUserPage() {
        return NEW_USER_PAGE;
    }

    @RequestMapping(path = "/addUser")
    public String addUser(@RequestParam String firstName, String lastName, String phone, String email, String login,
                          String password) {
        User user = new User(firstName, lastName, phone, email, login, password);

        return NEW_USER_PAGE;
    }
}
