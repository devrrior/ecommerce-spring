package com.devrrior.ecommercespring.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orderItems")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
