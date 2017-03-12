package com.ilboudofabrice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilboudofabrice.domain.Client;
import com.ilboudofabrice.service.interfaces.ClientService;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    private static String NEW_CLIENT_PAGE = "newClient";

    @RequestMapping(path = "/newClient")
    public String newClientPage() {
        return NEW_CLIENT_PAGE;
    }

    @RequestMapping(path = "/addClient")
    public String addClient(@RequestParam String name, String phone, String address, String country, String city) {
        clientService.addClient(name, phone, address, country, city);

        return "redirect:clients";
    }

    @RequestMapping(path = "/clients")
    public String getClients(ModelMap modelMap) {
        List<Client> clients = clientService.getClients();
        modelMap.put("clients", clients);
        return "clients";
    }
}
