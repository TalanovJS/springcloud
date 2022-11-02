package ru.vdcom.restfull.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.restfull.entity.RestBeanForTest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MainController {

    @GetMapping("/first")
    public String first() {
        return "From first endpoint";
    }

    @GetMapping("/obj")
    public RestBeanForTest getRestBean() {
        return new RestBeanForTest("Form Rest Bean endpoint");
    }

    @GetMapping("/name/{name}")
    public RestBeanForTest getRestBeanByPath(@PathVariable("name") String name) {
        return new RestBeanForTest(String.format("Hello, %s", name));
    }


}
