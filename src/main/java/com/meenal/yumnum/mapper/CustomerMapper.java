package com.meenal.yumnum.mapper;

import com.meenal.yumnum.dto.CustomerRequest;
import com.meenal.yumnum.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request){
        return Customer.builder()
                .firstName(request.firstName())
                //firstname is a getter because request is a record
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();
    }


}
