package com.ilboudofabrice.dao;

import com.ilboudofabrice.dao.interfaces.DeliveryDAO;
import com.ilboudofabrice.domain.Delivery;
import org.hibernate.SessionFactory;

/**
 * Created by filboudo on 2017-02-16.
 */
public class DeliveryDAOImpl implements DeliveryDAO {
    private SessionFactory sessionFactory;

    public int saveDelivery(Delivery delivery) {
        return 0;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
