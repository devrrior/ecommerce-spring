package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
