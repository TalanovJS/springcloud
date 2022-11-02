package ru.vdcom.restfull.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponse {
    private Date time;
    private String message;
    private String details;
}
