package com.ilboudofabrice.domain;

import java.io.Serializable;
import java.util.Date;

import javax.jws.soap.SOAPBinding;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

/**
 * Created by filboudo on 2017-02-16.
 */
@Entity
@Table(name = "DELIVERY")
@Proxy(lazy = false)
public class Delivery implements Serializable {
    @Id
    @Column(name = "DELIVERY_ID")
    private String id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @Column(name = "SEND_DATE")
    private Date sendDate;

    @Column(name = "RECEIVE_DATE")
    private Date receiveDate;

    @Column(name = "SENDER_COMMENTS")
    private String senderComments;

    @Column(name = "RECEIVER")
    private String receiver;

    @Column(name = "RECEIVER_COMMENTS")
    private String receiverComments;

    @Column(name = "SENDER_REFERENCES")
    private String senderReferences;

    @Column(name = "RECEIVER_REFERENCES")
    private String receiverReferences;

    @Column(name = "DELIVERY_STATUS")
    private String status;

    @Column(name = "RECEIVER_ADDRESS")
    private String receiverAddress;

    public Delivery() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getSenderComments() {
        return senderComments;
    }

    public void setSenderComments(String senderComments) {
        this.senderComments = senderComments;
    }

    public String getReceiverComments() {
        return receiverComments;
    }

    public void setReceiverComments(String receiverComments) {
        this.receiverComments = receiverComments;
    }

    public String getSenderReferences() {
        return senderReferences;
    }

    public void setSenderReferences(String senderReferences) {
        this.senderReferences = senderReferences;
    }

    public String getReceiverReferences() {
        return receiverReferences;
    }

    public void setReceiverReferences(String receiverReferences) {
        this.receiverReferences = receiverReferences;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
