package com.ilboudofabrice.domain;

import java.util.Date;

/**
 * Created by filboudo on 2017-02-16.
 */
public class Delivery {
    private String id;
    private String userFK;
    private String clientFK;
    private Date startDate;
    private Date endDate;
    private String startComments;
    private String endComments;
    private byte[] senderID;
    private byte[] receiverID;
    private String senderReferences;
    private String receiverReferences;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserFK() {
        return userFK;
    }

    public void setUserFK(String userFK) {
        this.userFK = userFK;
    }

    public String getClientFK() {
        return clientFK;
    }

    public void setClientFK(String clientFK) {
        this.clientFK = clientFK;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStartComments() {
        return startComments;
    }

    public void setStartComments(String startComments) {
        this.startComments = startComments;
    }

    public String getEndComments() {
        return endComments;
    }

    public void setEndComments(String endComments) {
        this.endComments = endComments;
    }

    public byte[] getSenderID() {
        return senderID;
    }

    public void setSenderID(byte[] senderID) {
        this.senderID = senderID;
    }

    public byte[] getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(byte[] receiverID) {
        this.receiverID = receiverID;
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
}
