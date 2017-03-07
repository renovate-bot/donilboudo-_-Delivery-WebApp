package com.ilboudofabrice.service;

import com.ilboudofabrice.dao.interfaces.DeliveryDAO;
import com.ilboudofabrice.domain.Delivery;
import com.ilboudofabrice.service.interfaces.DeliveryService;
import com.ilboudofabrice.util.DeliveryConstants;
import com.ilboudofabrice.util.RandomGUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by fabrice on 2017-03-05.
 */
public class DeliveryServiceImpl implements DeliveryService {
    @Resource
    private DeliveryDAO deliveryDAO;

    @Autowired
    public void setDeliveryDAO(DeliveryDAO deliveryDAO) {
        this.deliveryDAO = deliveryDAO;
    }

    public int addNewDelivery(String startDate, String senderName, String receiverName, String receiverAddress, String startComments) {
        Delivery delivery = new Delivery();
        delivery.setId(RandomGUIDGenerator.generateRandomGUID());
        delivery.setStartDate(new Date(startDate));
        delivery.setSenderReferences(senderName);
        delivery.setStartComments(startComments);
        delivery.setReceiverAddress(receiverAddress);
        delivery.setStatus(DeliveryConstants.START);

        return deliveryDAO.saveDelivery(delivery);
    }
}
