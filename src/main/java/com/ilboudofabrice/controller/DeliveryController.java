package com.ilboudofabrice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class DeliveryController {

    @RequestMapping(path = "/newDelivery")
    public void newDelivery(){

    }

    @RequestMapping(path = "/deliveries")
    public void getDeliveries(){

    }

    @RequestMapping(path = "/delivery/{id}")
    public void getDeliveryById(@PathVariable String id){

    }

    @RequestMapping(path = "/endDelivery/{id}")
    public void endDelivery(@PathVariable String id){

    }
}
