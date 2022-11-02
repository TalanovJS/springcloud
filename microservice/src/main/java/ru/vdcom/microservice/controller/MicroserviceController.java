package ru.vdcom.microservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.microservice.config.Configuration;
import ru.vdcom.microservice.config.MicroserviceConfiguration;

@RestController
@RequiredArgsConstructor
public class MicroserviceController {

    private final Configuration configuration;

    @GetMapping("/micro")
    public MicroserviceConfiguration getConfig() {
        return new MicroserviceConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }

}
