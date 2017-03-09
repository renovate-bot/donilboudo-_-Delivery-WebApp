package com.ilboudofabrice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.ilboudofabrice.util.RandomGUIDGenerator;

/**
 * Created by filboudo on 2017-02-16.
 */
@Entity
@Table(name = "CLIENT")
@Proxy(lazy = false)
public class Client implements Serializable {
    @Id
    @Column(name = "client_id")
    //    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_address")
    private String address;

    @Column(name = "client_phone")
    private String phone;

    @Column(name = "client_country")
    private String country;

    @Column(name = "client_city")
    private String city;

    public Client() {

    }

    public Client(String name, String phone, String address, String country, String city) {
        this.id = RandomGUIDGenerator.generateRandomGUID();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.country = country;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
