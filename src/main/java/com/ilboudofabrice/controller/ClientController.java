package com.ilboudofabrice.controller;

import com.ilboudofabrice.domain.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class ClientController {
    private static String NEW_CLIENT_PAGE = "newClient";

    @RequestMapping(path = "/newClient")
    public String newClientPage() {
        return NEW_CLIENT_PAGE;
    }

    @RequestMapping(path = "/addClient")
    public String addClient(@RequestParam String name, String phone, String address, String country, String city) {
        Client client = new Client(name, phone, address, country, city);
        return NEW_CLIENT_PAGE;
    }

    @RequestMapping(path = "/clients")
    public String getClients() {
        return "";
    }
}
