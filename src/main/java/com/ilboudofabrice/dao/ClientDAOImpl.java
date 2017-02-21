package com.ilboudofabrice.dao;

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

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    private Session getCurrentSession(){
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

    }

    public void removeClient(String clientId) {

    }

    public void updateClient(Client client) {

    }

    public List<Client> getClients() {
        return null;
    }

    public Client findClientById(String id) {
        return null;
    }

    public Client findClientByName(String name) {
        return null;
    }
}
