package com.devrrior.ecommercespring.controllers.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException (String message) {
        super(message);
    }
}
