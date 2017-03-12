package com.ilboudofabrice.dao.interfaces;

import java.util.List;

import com.ilboudofabrice.domain.Delivery;

/**
 * Created by filboudo on 2017-02-16.
 */
public interface DeliveryDAO {
    void saveDelivery(Delivery delivery);

    List<Delivery> getDeliveries();

    List<Delivery> getDeliveriesByUserId(String userId);

    List<Delivery> getMyOpenDeliveries(String userId);

    Delivery getDeliveryById(String deliveryId);

    void closeDelivery(String deliveryId, String receiveDate, String receiverReferences, String receiverComments);
}
