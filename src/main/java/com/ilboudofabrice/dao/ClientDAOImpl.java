package com.ilboudofabrice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ilboudofabrice.dao.interfaces.ClientDAO;
import com.ilboudofabrice.domain.Client;

/**
 * Created by filboudo on 2017-02-16.
 */
@Repository
public class ClientDAOImpl implements ClientDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {
        Session session;
        try
        {
            session = sessionFactory.getCurrentSession();
        }
        catch (HibernateException e)
        {
            session = sessionFactory.openSession();
        }

        return session;
    }

    public void addClient(Client client) {
        getSession().save(client);
    }

    public List<Client> getClients() {
        List<Client> clients = new ArrayList<Client>();
        clients.addAll(getSession().createQuery("from Client").list());
        return clients;
    }

    public void removeClient(String id) {
        Client client = findClientById(id);
        if (client != null)
        {
            getSession().delete(client);
        }
    }

    public Client findClientById(String id) {
        Client client = getSession().load(Client.class, id);
        if (client != null)
        {
            return client;
        }
        return null;
    }

    public Client findClientByName(String name) {
        return null;
    }

    public void updateClient(Client client) {

    }
}
