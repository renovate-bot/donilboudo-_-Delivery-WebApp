package com.ilboudofabrice.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by filboudo on 2017-03-10.
 */
@Entity
@Table(name = "SESSION")
//@Proxy(lazy = false)
public class Session implements Serializable {
    @Id
    @Column(name = "SESSION_ID")
    private String sessionId;

    @Column(name = "LOGIN_DATE")
    private Date loginDate;

    @Column(name = "LOGOUT_DATE")
    private Date logoutDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "USER_ID")
    private User user;

    public Session() {

    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
