package ru.vdcom.feignclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.vdcom.feignclient.dto.UserResponse;

import java.util.List;

@FeignClient(name = "users", url = "https://jsonplaceholder.typicode.com/")
public interface UserClient {

    @GetMapping("/users")
    List<UserResponse> findAll();

}
