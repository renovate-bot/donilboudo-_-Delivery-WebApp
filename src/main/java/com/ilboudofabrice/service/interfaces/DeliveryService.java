package com.ilboudofabrice.service.interfaces;

import java.util.List;

import com.ilboudofabrice.domain.Delivery;

/**
 * Created by fabrice on 2017-03-05.
 */
public interface DeliveryService {
    List<Delivery> getDeliveries();

    List<Delivery> getDeliveriesByUserId(String userId);

    List<Delivery> getMyOpenDeliveries(String userId);

    void addNewDelivery(String clientId, String employeeId, String sendDate, String senderReferences, String senderComments, String receiver, String receiverAddress);

    Delivery getDeliveryById(String deliveryId);

    void closeDelivery(String deliveryId, String receiveDate, String receiverReferences, String receiverComments);

    //    void closeDelivery(String )
}
