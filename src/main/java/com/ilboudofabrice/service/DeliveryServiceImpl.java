package com.ilboudofabrice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ilboudofabrice.dao.interfaces.ClientDAO;
import com.ilboudofabrice.dao.interfaces.DeliveryDAO;
import com.ilboudofabrice.dao.interfaces.UserDAO;
import com.ilboudofabrice.domain.Client;
import com.ilboudofabrice.domain.Delivery;
import com.ilboudofabrice.domain.User;
import com.ilboudofabrice.service.interfaces.DeliveryService;
import com.ilboudofabrice.util.DeliveryConstants;
import com.ilboudofabrice.util.RandomGUIDGenerator;

/**
 * Created by fabrice on 2017-03-05.
 */
public class DeliveryServiceImpl implements DeliveryService {
    @Autowired
    private DeliveryDAO deliveryDAO;

    @Autowired
    private ClientDAO clientDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    public void setDeliveryDAO(DeliveryDAO deliveryDAO) {
        this.deliveryDAO = deliveryDAO;
    }

    @Transactional
    public List<Delivery> getDeliveries() {
        return deliveryDAO.getDeliveries();
    }

    @Transactional
    public List<Delivery> getDeliveriesByUserId(String userId) {
        return deliveryDAO.getDeliveriesByUserId(userId);
    }

    @Transactional
    public List<Delivery> getMyOpenDeliveries(String userId) {
        return deliveryDAO.getMyOpenDeliveries(userId);
    }

    @Transactional
    public void addNewDelivery(String clientId, String employeeId, String sendDate, String senderReferences, String senderComments, String receiver, String receiverAddress) {
       //find user
        User user = userDAO.findUserById(employeeId);

        //find client
        Client client = clientDAO.findClientById(clientId);

        if (user != null && client != null)
        {
            Delivery delivery = new Delivery();
            delivery.setId(RandomGUIDGenerator.generateRandomGUID());
            delivery.setSendDate(new Date(sendDate));
            delivery.setSenderReferences(senderReferences);
            delivery.setSenderComments(senderComments);
            delivery.setReceiverAddress(receiverAddress);
            delivery.setStatus(DeliveryConstants.START);
            delivery.setUserId(user.getId());
            delivery.setClientId(client.getId());
            delivery.setReceiver(receiver);

            deliveryDAO.saveDelivery(delivery);
        }
    }

    @Transactional
    public Delivery getDeliveryById(String deliveryId) {
        return deliveryDAO.getDeliveryById(deliveryId);
    }

    @Transactional
    public void closeDelivery(String deliveryId, String receiveDate, String receiverReferences, String receiverComments) {
        deliveryDAO.closeDelivery(deliveryId, receiveDate, receiverReferences, receiverComments);
    }
}
