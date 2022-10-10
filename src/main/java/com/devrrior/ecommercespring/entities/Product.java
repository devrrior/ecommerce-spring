package com.devrrior.ecommercespring.entities;

import com.devrrior.ecommercespring.entities.pivots.ProductCategory;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Integer stock;

    private Float price;

    @OneToMany(mappedBy = "product")
    private List<ProductCategory> productCategories;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
