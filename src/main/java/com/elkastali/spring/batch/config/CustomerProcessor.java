package com.elkastali.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.elkastali.spring.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
		// TODO Auto-generated method stub
		return item;
	}

}
