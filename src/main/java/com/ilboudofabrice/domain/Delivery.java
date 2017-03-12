package com.ilboudofabrice.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "CLIENT_ID")
    private String clientId;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
