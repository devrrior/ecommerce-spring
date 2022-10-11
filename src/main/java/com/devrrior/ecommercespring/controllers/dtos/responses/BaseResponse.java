package com.devrrior.ecommercespring.controllers.dtos.responses;

import lombok.*;
import org.springframework.http.HttpStatus;

@Builder @Setter
public class BaseResponse{
    private Object data;
    private String message;
    private Boolean success;
    private HttpStatus httpStatus;
}
