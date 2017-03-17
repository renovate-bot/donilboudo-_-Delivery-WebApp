package com.ilboudofabrice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ilboudofabrice.domain.Client;
import com.ilboudofabrice.service.LoginServiceImpl;
import com.ilboudofabrice.service.interfaces.ClientService;
import com.ilboudofabrice.service.interfaces.LoginService;
import com.ilboudofabrice.util.LoginConstants;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class ClientController {
    @Autowired
    private ClientService clientService;

    @Autowired
    LoginService loginService;

    @RequestMapping(path = "/newClient", method = RequestMethod.GET)
    public String newClientPage(HttpSession httpSession) {
        String userSessionId = (String) httpSession.getAttribute(LoginServiceImpl.USER_SESSION);
        if (loginService.isValidSession(userSessionId))
        {
            return "newClient";
        }
        else
        {
            return LoginConstants.REDIRECT_LOGIN_PAGE;
        }
    }

    @RequestMapping(path = "/newClient", method = RequestMethod.POST)
    public String addClient(HttpSession httpSession, @RequestParam String name, String phone, String address, String country, String city) {
        String userSessionId = (String) httpSession.getAttribute(LoginServiceImpl.USER_SESSION);
        if (loginService.isValidSession(userSessionId))
        {
            clientService.addClient(name, phone, address, country, city);

            return "redirect:clients";
        }
        else
        {
            return LoginConstants.REDIRECT_LOGIN_PAGE;
        }
    }

    @RequestMapping(path = "/clients", method = RequestMethod.GET)
    public String getClients(ModelMap modelMap, HttpSession httpSession) {
        String userSessionId = (String) httpSession.getAttribute(LoginServiceImpl.USER_SESSION);
        if (loginService.isValidSession(userSessionId))
        {
            modelMap.put("clients", clientService.getClients());

            return "clients";
        }
        else
        {
            return LoginConstants.REDIRECT_LOGIN_PAGE;
        }
    }

    @RequestMapping(path = "/mobile/clients", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Client> getClientsFromMobile(HttpSession httpSession) {
        String userSessionId = (String) httpSession.getAttribute(LoginServiceImpl.USER_SESSION);
        if (loginService.isValidSession(userSessionId))
        {
            return clientService.getClients();
        }
        else
        {
            return new ArrayList<Client>();
        }
    }
}
