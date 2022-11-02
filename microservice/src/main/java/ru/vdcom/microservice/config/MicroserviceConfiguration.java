package ru.vdcom.microservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MicroserviceConfiguration {
    private int maximum;
    private int minimum;
}
