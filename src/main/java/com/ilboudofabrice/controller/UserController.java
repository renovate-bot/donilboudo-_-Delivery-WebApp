package com.ilboudofabrice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilboudofabrice.service.LoginServiceImpl;
import com.ilboudofabrice.service.interfaces.LoginService;
import com.ilboudofabrice.service.interfaces.UserService;
import com.ilboudofabrice.util.LoginConstants;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    LoginService loginService;

    @RequestMapping(path = "/addUser", method = RequestMethod.GET)
    public String newUserPage() {
        return "newUser";
    }

    @RequestMapping(path = "/addUser", method = RequestMethod.POST)
    public String addUser(HttpSession httpSession, @RequestParam String firstName, String lastName, String phone, String email, String login, String password, String role) {
        if (loginService.isValidSession((String) httpSession.getAttribute(LoginServiceImpl.USER_SESSION)))
        {
            userService.addUser(firstName, lastName, phone, email, login, password, role);

            return "redirect:/users";
        }
        else
        {
            return LoginConstants.REDIRECT_LOGIN_PAGE;
        }
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

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap, HttpSession httpSession) {
        if (loginService.isValidSession((String) httpSession.getAttribute(LoginServiceImpl.USER_SESSION)))
        {
            modelMap.put("users", userService.getUsers());

            return "users";
        }
        else
        {
            return LoginConstants.REDIRECT_LOGIN_PAGE;
        }
    }
}
