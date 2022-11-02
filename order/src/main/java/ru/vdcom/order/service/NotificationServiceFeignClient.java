package ru.vdcom.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//@FeignClient(value = "notification", name = "notification", url = "http://localhost:8002/")
//@FeignClient(name = "notification", url = "http://localhost:8002/")
//public interface NotificationServiceFeignClient {
//
//    @PostMapping("/notification")
//    String sendNotification(@RequestBody String notification);
//
//}
