package com.RentACar.AH.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.RentACar.AH.beans.Customer;
import com.RentACar.AH.repo.CustomerRepository;

@Service
@Scope("prototype")
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	

	public Customer addCustomer(Customer customer) {

		return customerRepository.save(customer);
		
	}
	
	public Customer getCustomer(int id) {
		return customerRepository.getOne(id);
	}

}
