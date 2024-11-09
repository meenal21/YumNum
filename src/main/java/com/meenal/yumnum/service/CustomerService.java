package com.meenal.yumnum.service;

import com.meenal.yumnum.dto.CustomerRequest;
import com.meenal.yumnum.entity.Customer;
import com.meenal.yumnum.mapper.CustomerMapper;
import com.meenal.yumnum.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerMapper mapper;
    private final CustomerRepo repo;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "created";
    }
}
