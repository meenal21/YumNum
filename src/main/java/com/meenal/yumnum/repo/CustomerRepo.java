package com.meenal.yumnum.repo;

import com.meenal.yumnum.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepo extends JpaRepository<Customer, Long>{}
