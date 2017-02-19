package com.ilboudofabrice.domain;

import java.util.List;

import com.ilboudofabrice.util.RandomGUIDGenerator;

/**
 * Created by filboudo on 2017-02-16.
 */
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String login;
    private String password;
    private List<String> appAccesses;

    public User(){

    }

    public User(String firstName, String lastName, String email, String phone, String login, String password, List<String> appAccesses){
        this.id = RandomGUIDGenerator.generateRandomGUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.appAccesses = appAccesses;
    }

    public User(String firstName, String lastName, String phone, String email, String login, String password) {
        this.id = RandomGUIDGenerator.generateRandomGUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getAppAccesses() {
        return appAccesses;
    }

    public void setAppAccesses(List<String> appAccesses) {
        this.appAccesses = appAccesses;
    }
}
