package ru.vdcom.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vdcom.users.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<String> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public String handle(ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
        return "NOT FOUND";
    }
}
