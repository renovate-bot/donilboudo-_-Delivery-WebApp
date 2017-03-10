package com.ilboudofabrice.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
    @Column(name = "user_id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

//    private Set<Role> roles;


//    private List<String> appAccesses;

    public User(){

    }

//    public User(String firstName, String lastName, String email, String phone, String login, String password, List<String> appAccesses){
//        this.id = RandomGUIDGenerator.generateRandomGUID();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phone = phone;
//        this.login = login;
//        this.password = PasswordHelper.md5(password);
//        this.appAccesses = appAccesses;
//    }

    public User(String firstName, String lastName, String phone, String email, String login, String password) {
        this.id = RandomGUIDGenerator.generateRandomGUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.login = login;
        this.password = PasswordHelper.md5(password);
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

//    @ManyToMany
//    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }

//    public List<String> getAppAccesses() {
//        return appAccesses;
//    }
//
//    public void setAppAccesses(List<String> appAccesses) {
//        this.appAccesses = appAccesses;
//    }
}
