package com.devrrior.ecommercespring.services.interfaces;

import com.devrrior.ecommercespring.entities.User;

public interface IUserService {
    User findAndEnsureExist(Long id);
}
