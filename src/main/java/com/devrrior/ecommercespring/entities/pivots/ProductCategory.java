package com.devrrior.ecommercespring.entities.pivots;

import com.devrrior.ecommercespring.entities.Category;
import com.devrrior.ecommercespring.entities.Product;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "products_categories")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
