package com.meenal.yumnum.mapper;

import com.meenal.yumnum.dto.ProductRequest;
import com.meenal.yumnum.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public Product toEntity(ProductRequest request) {
        return Product.builder()
                .name(request.name())
                .price(request.price())
                .build();
    }
}
