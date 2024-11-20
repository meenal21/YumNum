package com.meenal.yumnum.controller;


import com.meenal.yumnum.entity.Product;
import com.meenal.yumnum.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/queryresult")
    public ResponseEntity<List<Product>> queryResult(@RequestHeader("Authorization") String auth_token) {
        if(auth_token == null || auth_token.isEmpty()){
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);}
        if(productService.authenticateToken(auth_token)){
            return ResponseEntity.ok(productService.getQueryResult());}
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
