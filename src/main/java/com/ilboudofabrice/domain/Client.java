package com.ilboudofabrice.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.ilboudofabrice.util.RandomGUIDGenerator;

/**
 * Created by filboudo on 2017-02-16.
 */
@Entity
public class Client implements Serializable {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String country;
    private String city;

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
