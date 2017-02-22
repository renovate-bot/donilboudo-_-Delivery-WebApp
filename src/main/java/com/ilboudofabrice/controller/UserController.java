package com.ilboudofabrice.controller;

import com.ilboudofabrice.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(path = "/deleteUser/{id}")
    public String deleteUser(@PathVariable String id) {
        //dao.deleteUser
        return "users";
    }

    @RequestMapping(path = "/updateUser/{id}")
    public String updateUser(@PathVariable String id) {
        return "updateUser";
    }

    @RequestMapping(path = "/users")
    public String getUsers() {
        return "users";
    }

    @RequestMapping(path = "/saveUser")
    public String saveUser(@RequestParam String firstName, String lastName, String phone, String email, String login,
                           String password) {

        return "users";
    }
}
