package com.meenal.yumnum.controller;


import com.meenal.yumnum.dto.CustomerLoginRequest;
import com.meenal.yumnum.dto.CustomerRequest;
import com.meenal.yumnum.dto.CustomerResponse;
import com.meenal.yumnum.entity.Customer;
import com.meenal.yumnum.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;
    //to create customer, need to get details from the user - so post
    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request){
        return ResponseEntity.ok(customerService.createCustomer(request));
    }

    @GetMapping("/{email}")
    public ResponseEntity<CustomerResponse> getCustomer(@PathVariable("email") String email){
        return ResponseEntity.ok(customerService.getCustomer(email));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody @Valid CustomerLoginRequest request){
        return ResponseEntity.ok(customerService.loginCustomer(request));
    }
}
