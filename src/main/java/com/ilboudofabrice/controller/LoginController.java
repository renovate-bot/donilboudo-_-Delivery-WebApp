package com.ilboudofabrice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class LoginController {

    @RequestMapping(path = "/loginFromWeb")
    public String login(){
        return "login";
    }

    @RequestMapping(path = "/loginFromMobile")
    public int loginFromMobile(@RequestParam String login, String password) {

        return HttpsURLConnection.HTTP_OK;
    }
}
