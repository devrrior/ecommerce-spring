package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
