package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
