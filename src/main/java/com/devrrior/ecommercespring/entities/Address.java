package com.devrrior.ecommercespring.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zipcode;

    private String state;

    private String country;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
