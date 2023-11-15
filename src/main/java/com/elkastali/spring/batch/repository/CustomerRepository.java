package com.elkastali.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elkastali.spring.batch.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

}
