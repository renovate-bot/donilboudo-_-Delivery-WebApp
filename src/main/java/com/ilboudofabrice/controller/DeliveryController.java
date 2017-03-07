package com.ilboudofabrice.controller;

import com.ilboudofabrice.domain.Delivery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by filboudo on 2017-02-16.
 */
@Controller
public class DeliveryController {
//    @Resource
//    private DeliveryService deliveryService;
//
//    @Autowired
//    @Qualifier(value="deliveryService")
//    public void setBookService(DeliveryService deliveryService){
//        this.deliveryService = deliveryService;
//    }


    @RequestMapping(path = "/newDelivery")
    public void newDelivery(@RequestParam String startDate, String senderName, String receiverName, String receiverAddress,
                            String startComments) {

//        deliveryService.addNewDelivery(startDate, senderName, receiverName, receiverAddress, startComments);
    }

    @RequestMapping(path = "/myDeliveries")
    public List<Delivery> getDeliveries(@RequestParam String userId) {
        Delivery delivery1 = new Delivery();
        delivery1.setId("1");
        delivery1.setStartDate(new Date());
        delivery1.setClientFK("1");

        List<Delivery> deliveries = new ArrayList<Delivery>();
        deliveries.add(delivery1);

        return deliveries;

    }

    @RequestMapping(path = "/delivery/{id}")
    public void getDeliveryById(@PathVariable String id){

    }

    @RequestMapping(path = "/endDelivery/{id}")
    public void endDelivery(@PathVariable String id){

    }

    @RequestMapping(path = "/deliveries/{id}")
    public void getMyDeliveries(@PathVariable String id) {

    }
}
