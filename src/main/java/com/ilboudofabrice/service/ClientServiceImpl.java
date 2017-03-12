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
    public List<Client> getClients() {
        return clientDAO.getClients();
    }

    @Transactional
    public void removeClient(String id) {

    }

    @Transactional
    public Client findClientById(String id) {
        return clientDAO.findClientById(id);
    }

    @Transactional
    public Client findClientByName(String name) {
        return null;
    }

    public void updateClient(Client client) {

    }

    @Transactional
    public void addClient(String name, String phone, String address, String country, String city) {
        Client client = new Client(name, phone, address, country, city);
        clientDAO.addClient(client);
    }
}
