package ru.vdcom.restfull.entity;

import lombok.Data;

@Data
public class RestBeanForTest {

    private final String message;

    public RestBeanForTest(String message) {
        this.message = message;
    }
}
