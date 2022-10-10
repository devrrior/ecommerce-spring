package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.pivots.ProductCategory;
import com.devrrior.ecommercespring.entities.projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

    @Query(value = "select products.* from producst_categories " +
            "inner join products on products_categories.product_id = products.id " +
            "inner join categories on products_categories.category_id = categories.id " +
            "where products_categories.category_id = :categoryId", nativeQuery = true)
    List<ProductProjection> listAllProductsByCategoryId(Long categoryId);

    @Query(value = "select categories.* from producst_categories " +
            "inner join products on products_categories.product_id = products.id " +
            "inner join categories on products_categories.category_id = categories.id " +
            "where products_categories.product_id = :productId", nativeQuery = true)
    List<ProductProjection> listAllCategoriesByProductId(Long productId);
}
