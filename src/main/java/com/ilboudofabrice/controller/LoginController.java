package com.ilboudofabrice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class LoginController {
    private String adminPassword = "d47de916cacdb7bb6879a4013d8b7d7";
    private String adminLogin = "fabrice";

    @RequestMapping(path = "/loginFromWeb")
    public String login(){
        return "login";
    }

    @RequestMapping(path = "/loginFromMobile")
    public ResponseEntity loginFromMobile(@RequestParam String login, String password) {
        if(login.equals(adminLogin) && password.equals(adminPassword)) {
            return new ResponseEntity(HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }
    }
}
