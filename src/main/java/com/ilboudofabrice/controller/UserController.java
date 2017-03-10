package com.ilboudofabrice.controller;

import java.util.ArrayList;
import java.util.List;

import com.ilboudofabrice.domain.User;
import com.ilboudofabrice.service.interfaces.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(path = "/addUser", method = RequestMethod.GET)
    public String newUserPage() {
        return "newUser";
    }

    @RequestMapping(path = "/addUser", method = RequestMethod.POST)
    public String addUser(@RequestParam String firstName, String lastName, String phone, String email, String login, String password) {
        List<String> access = new ArrayList<String>();
        userService.addUser(firstName, lastName, phone, email, login, password, access);

        return "redirect:/users";
    }

    @RequestMapping(path = "/deleteUser/{id}")
    public String deleteUser(@PathVariable String userId) {
        //dao.deleteUser
        return "users";
    }

    @RequestMapping(path = "/updateUser/{id}")
    public String updateUser(@PathVariable String userId) {
        return "updateUser";
    }

    @RequestMapping(path = "/users")
    public String getUsers(ModelMap modelMap) {
        List<User> users = userService.getUsers();
        modelMap.put("users", users);

        return "users";
    }
}
