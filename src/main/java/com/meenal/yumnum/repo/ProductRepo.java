package com.meenal.yumnum.repo;

import com.meenal.yumnum.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductRepo extends JpaRepository<Product, Integer> {
    public Product findByName(String name);

    @Query(value = "SELECT *  from product p where p.price between 15 and 20 limit 2", nativeQuery = true)
    List<Product> findTop2WithPriceRange();
}
