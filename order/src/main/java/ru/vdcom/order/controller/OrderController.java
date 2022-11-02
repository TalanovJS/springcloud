package ru.vdcom.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.feignclient.controller.UserClient;
import ru.vdcom.feignclient.dto.UserResponse;

import java.util.List;

@RestController
public class OrderController {

    private final UserClient userClient;

    @Autowired
    public OrderController(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/users")
    public List<UserResponse> findAll(){
        return userClient.findAll();
    }

//    private final NotificationServiceFeignClient notificationServiceFeignClient;
//
//    @Autowired
//    public OrderController(NotificationServiceFeignClient notificationServiceFeignClient) {
//        this.notificationServiceFeignClient = notificationServiceFeignClient;
//    }
//
//    @GetMapping("/order")
//    public String order(@RequestParam String orderName) {
//        try{
//            notificationServiceFeignClient.sendNotification("Вы заказали: " + orderName);
//            return "Был сделан заказ " + orderName.toUpperCase();
//        }catch (Exception e) {
//            return "Exception. Message dont send.";
//        }
//    }
}
