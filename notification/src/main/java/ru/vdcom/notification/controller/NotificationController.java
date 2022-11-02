package ru.vdcom.notification.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/notification")
    public void sendNotification(@RequestBody String notification) {
        System.out.println("Обрабатываю заказ: " + notification);
    }
}
