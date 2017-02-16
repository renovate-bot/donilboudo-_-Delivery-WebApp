package com.ilboudofabrice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class LoginController {

    @RequestMapping(path = "/")
    public String login(){
        return "login";
    }
}
