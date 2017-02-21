package com.ilboudofabrice.dao.interfaces;

import java.util.List;

import com.ilboudofabrice.domain.Client;

/**
 * Created by filboudo on 2017-02-16.
 */
public interface ClientDAO {
    void addClient(Client client);
    void removeClient(String clientId);
    void updateClient(Client client);
    List<Client> getClients();
    Client findClientById(String id);
    Client findClientByName(String name);
}
