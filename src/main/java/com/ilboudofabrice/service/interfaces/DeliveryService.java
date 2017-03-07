package com.ilboudofabrice.service.interfaces;

import java.util.Date;

/**
 * Created by fabrice on 2017-03-05.
 */
public interface DeliveryService {
    int addNewDelivery(String startDate, String senderName, String receiverName, String receiverAddress, String startComments);

}
