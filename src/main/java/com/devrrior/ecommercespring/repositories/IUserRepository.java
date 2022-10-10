package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
