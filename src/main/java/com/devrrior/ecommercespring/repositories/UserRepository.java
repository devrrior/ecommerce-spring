package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
