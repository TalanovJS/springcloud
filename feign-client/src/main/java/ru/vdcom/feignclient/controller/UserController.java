package ru.vdcom.feignclient.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.feignclient.dto.UserResponse;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserClient userClient;

    @GetMapping("/get-users")
    public List<UserResponse> findAll(){
        return userClient.findAll();
    }
}
