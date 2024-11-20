package com.meenal.yumnum.service;

import com.meenal.yumnum.dto.CustomerLoginRequest;
import com.meenal.yumnum.dto.CustomerRequest;
import com.meenal.yumnum.dto.CustomerResponse;
import com.meenal.yumnum.entity.Customer;
import com.meenal.yumnum.mapper.CustomerMapper;
import com.meenal.yumnum.repo.CustomerRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerMapper mapper;
    private final CustomerRepo repo;
    private final PasswordEncoder encoder;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        customer.setPassword(encoder.encode(customer.getPassword()));
        repo.save(customer);
        return "created";
    }

    public Customer retrieveCustomerByEmail(String email) {
        return repo.findByEmail(email);
    }

    public CustomerResponse getCustomer(String email) {
        Customer customer  = retrieveCustomerByEmail(email);
        CustomerResponse cust = new CustomerResponse(customer.getFirstName(), customer.getLastName(), customer.getEmail());

        return cust;
    }

    public String loginCustomer(@Valid CustomerLoginRequest request) {
           Customer cust = retrieveCustomerByEmail(request.email());

           if(encoder.matches(request.password(),cust.getPassword())){
               return "logged in!";
           }
           return "Bad Credentials!";

    }
}


//Mrunmayi Shirke - mrunmayi.shirke@gmail.com mrunmayi
