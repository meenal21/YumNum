package com.meenal.yumnum.service;


import com.meenal.yumnum.entity.Product;
import com.meenal.yumnum.helper.JWTHelper;
import com.meenal.yumnum.mapper.ProductMapper;
import com.meenal.yumnum.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductService {
    private final ProductMapper productMapper;
    private final ProductRepo productRepo;
    private final JWTHelper jwt;

    public List<Product> getQueryResult(){
        return productRepo.findTop2WithPriceRange();
    }

    public boolean authenticateToken(String auth_token){
        String token = auth_token.substring(7);
        return jwt.validateToken(token);
    }

}
