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
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<ProductCategory> productCategories;

}
