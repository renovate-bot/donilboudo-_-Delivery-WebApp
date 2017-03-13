package com.ilboudofabrice.mapper;

import java.util.ArrayList;
import java.util.List;

import com.ilboudofabrice.domain.Client;
import com.ilboudofabrice.domain.Delivery;
import com.ilboudofabrice.domain.User;
import com.ilboudofabrice.dto.DeliveryDTO;
import com.ilboudofabrice.service.interfaces.ClientService;
import com.ilboudofabrice.service.interfaces.UserService;

/**
 * Created by filboudo on 2017-03-11.
 */
public class DeliveryMapper {
    public static DeliveryDTO toDeliveryDTO(Delivery delivery, UserService userService, ClientService clientService) {
        DeliveryDTO dto = new DeliveryDTO();
        dto.setId(delivery.getId());
        User user = userService.findUserById(delivery.getUser().getId());
        if (user != null)
        {
            dto.setUser(user);
        }
        Client client = clientService.findClientById(delivery.getClient().getId());
        if (client != null)
        {
            dto.setClient(client);
        }
        dto.setReceiver(delivery.getReceiver());
        dto.setSendDate(delivery.getSendDate());
        dto.setSenderReferences(delivery.getSenderReferences());
        dto.setSenderComments(delivery.getSenderComments());
        dto.setReceiveDate(delivery.getReceiveDate());
        dto.setReceiverAddress(delivery.getReceiverAddress());
        dto.setStatus(delivery.getStatus());
        dto.setReceiverReferences(delivery.getReceiverReferences());
        dto.setReceiverComments(delivery.getReceiverComments());

        return dto;
    }

    public static List<DeliveryDTO> toDeliveriesDTO(List<Delivery> deliveries, UserService userService, ClientService clientService) {
        List<DeliveryDTO> deliveryDTOs = new ArrayList<DeliveryDTO>();
        for (Delivery delivery : deliveries)
        {
            deliveryDTOs.add(toDeliveryDTO(delivery, userService, clientService));
        }

        return deliveryDTOs;
    }
}
