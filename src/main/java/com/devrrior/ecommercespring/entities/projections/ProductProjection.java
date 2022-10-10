package com.devrrior.ecommercespring.entities.projections;

import com.devrrior.ecommercespring.entities.User;

public interface ProductProjection {
    Long getId();

    String getTitle();

    String getDescription();

    Integer getStock();

    Float getPrice();

    User getUser();
}
