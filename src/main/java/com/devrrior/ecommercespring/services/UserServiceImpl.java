package com.devrrior.ecommercespring.services;

import com.devrrior.ecommercespring.controllers.exceptions.ObjectNotFoundException;
import com.devrrior.ecommercespring.entities.User;
import com.devrrior.ecommercespring.repositories.IUserRepository;
import com.devrrior.ecommercespring.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository repository;

    @Override
    public User findAndEnsureExist(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }
}
