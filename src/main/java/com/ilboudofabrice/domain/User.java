package com.ilboudofabrice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.ilboudofabrice.util.PasswordHelper;
import com.ilboudofabrice.util.RandomGUIDGenerator;

/**
 * Created by filboudo on 2017-02-16.
 */
@Entity
@Table(name = "USER")
@Proxy(lazy = false)
public class User implements Serializable{
    @Id
    @Column(name = "USER_ID")
    private String id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE")
    private String role;

    public User(){

    }

//    public User(String firstName, String lastName, String email, String phone, String userName, String password, List<String> appAccesses){
//        this.id = RandomGUIDGenerator.generateRandomGUID();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phone = phone;
//        this.userName = userName;
//        this.password = PasswordHelper.md5(password);
//        this.appAccesses = appAccesses;
//    }

    public User(String firstName, String lastName, String phone, String email, String userName, String password, String role) {
        this.id = RandomGUIDGenerator.generateRandomGUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.userName = userName;
        this.password = PasswordHelper.md5(password);
        this.role = role;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
