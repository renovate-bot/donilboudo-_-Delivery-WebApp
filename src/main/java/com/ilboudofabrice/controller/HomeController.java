package com.ilboudofabrice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class HomeController {

    @RequestMapping(path = "/home")
    public String home(ModelMap modelMap){
        return "home";
    }
}
