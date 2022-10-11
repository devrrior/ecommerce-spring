package com.devrrior.ecommercespring.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CreateAddressRequest {

    private String street;

    private String zipcode;

    private String state;

    private String country;

    private Long userId;

}
