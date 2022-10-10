package com.devrrior.ecommercespring.constants;

public enum UserRoleEnum {

    ADMIN(0),
    STAFF(1),
    BUYER(2);

    private final int status;

    UserRoleEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }
}
