package com.devrrior.ecommercespring.constants;

public enum OrderStatusEnum {

    DELIVERED(0),
    IN_PROCESS(1),
    PENDING(2);

    private final int status;

    OrderStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus(){
        return this.status;
    }
}
