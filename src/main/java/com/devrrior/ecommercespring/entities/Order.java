package com.devrrior.ecommercespring.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
