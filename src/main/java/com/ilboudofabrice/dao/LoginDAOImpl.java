package com.ilboudofabrice.dao;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ilboudofabrice.dao.interfaces.LoginDAO;
import com.ilboudofabrice.domain.User;

/**
 * Created by filboudo on 2017-03-10.
 */
@Repository
public class LoginDAOImpl implements LoginDAO {
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

    public void login(String sessionId, User user) {
        com.ilboudofabrice.domain.Session session = new com.ilboudofabrice.domain.Session();
        session.setSessionId(sessionId);
        session.setLoginDate(new Date());
        session.setUser(user);

        getSession().save(session);
    }

    public boolean isLogin(String sessionId) {
        com.ilboudofabrice.domain.Session session = getSession().load(com.ilboudofabrice.domain.Session.class, sessionId);
        return session != null && session.getLogoutDate() != null;
    }

    public void logout(String sessionId) {
        com.ilboudofabrice.domain.Session session = getSession().load(com.ilboudofabrice.domain.Session.class, sessionId);
        if (session != null)
        {
            session.setLogoutDate(new Date());
        }
    }
}
