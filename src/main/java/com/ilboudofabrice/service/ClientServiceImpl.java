package com.ilboudofabrice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ilboudofabrice.dao.interfaces.ClientDAO;
import com.ilboudofabrice.domain.Client;
import com.ilboudofabrice.service.interfaces.ClientService;

/**
 * Created by filboudo on 2017-02-16.
 */
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientDAO clientDAO;

    public void setClientDAO(ClientDAO clientDAO){
        this.clientDAO = clientDAO;
    }

    @Transactional
    public void addClient(Client client) {
        clientDAO.addClient(client);
    }

    @Transactional
    public List<Client> getClients() {
        return clientDAO.getClients();
    }

    @Transactional
    public void removeClient(String id) {

    }

    @Transactional
    public Client findClientById(String id) {
        return null;
    }

    @Transactional
    public Client findClientByName(String name) {
        return null;
    }

    public void updateClient(Client client) {

    }
}
