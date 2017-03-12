package com.ilboudofabrice.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ilboudofabrice.dao.interfaces.UserDAO;
import com.ilboudofabrice.domain.User;

/**
 * Created by filboudo on 2017-02-16.
 */
@Repository
public class UserDAOImpl implements UserDAO {
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

    public void addUser(User user) {
        getSession().save(user);
    }

    public void deleteUser(String userId) {
        User user = getSession().load(User.class, userId);
        if (user != null)
        {
            getSession().delete(user);
        }
    }

    public void updateLoginAndPassword(String userId, String login, String password) {

    }

    public void updatePassword(String userId, String password) {

    }

    public void updateAppAccess(List<String> appAccesses) {

    }

    public User findUserByCredentials(String userName, String password) {
        String hql = "select * from User where login = :userName and password = :password";
        Query query = (Query) getSession().createNativeQuery(hql, User.class);
        query.setParameter("userName", userName);
        query.setParameter("password", password);

        return (User) query.uniqueResult();
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.addAll(getSession().createQuery("from User").list());

        return users;
    }

    public boolean isValidUser(String userName, String password) {
        String hql = "select count(*) from user where login = :userName and password = :password";
        Query query = getSession().createNativeQuery(hql);
        query.setParameter("userName", userName);
        query.setParameter("password", password);

        return ((Number)query.uniqueResult()).intValue() > 0;
    }

    public User findUserById(String userId) {
        return getSession().load(User.class, userId);
    }
}
