package com.ilboudofabrice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilboudofabrice.domain.User;
import com.ilboudofabrice.service.interfaces.LoginService;
import com.ilboudofabrice.service.interfaces.UserService;
import com.ilboudofabrice.util.PasswordHelper;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
@RequestMapping(path = {"/"})
public class LoginController {
    @Autowired
    UserService userService;

    @Autowired
    LoginService loginService;

    private String adminPassword = "d47de916cacdb7bb6879a4013d8b7d7";
    private String adminLogin = "fabrice";

    @RequestMapping(path = {"/"})
    public String login() {
        return "login";
    }

    @RequestMapping(path = {"/loginFromWeb"})
    public String loginFromWeb(ModelMap modelMap, @RequestParam String userName, String password) {
        User user = userService.findUserByCredentials(userName, PasswordHelper.md5(password));
        if (user != null)
        {
            loginService.login(user);

            return "redirect:home";
        }
        else
        {
            modelMap.put("errorMessage", "Nom d'utilisateur ou mot de passe incorrect!");
            return "login";
        }
    }

    @RequestMapping(path = "/loginFromMobile")
    public ResponseEntity loginFromMobile(@RequestParam String login, String password) {
        if (login.equals(adminLogin) && password.equals(adminPassword))
        {
            return new ResponseEntity(HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
    }

    @RequestMapping(path = "/logout")
    public String logout(@RequestParam String sessionId) {
        loginService.logout(sessionId);

        return "redirect:/";
    }
}
