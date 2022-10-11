package com.devrrior.ecommercespring.controllers.dtos.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Setter
public class GetAddressResponse {

    private String street;

    private String zipcode;

    private String state;

    private String country;

    private Long userId;

}
