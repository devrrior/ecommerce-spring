package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
