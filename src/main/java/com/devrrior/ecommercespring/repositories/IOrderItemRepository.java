package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
}
