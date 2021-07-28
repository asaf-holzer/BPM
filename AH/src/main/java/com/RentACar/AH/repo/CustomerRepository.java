package com.RentACar.AH.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RentACar.AH.beans.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	public Customer findByidNumber(int idNumber);
}

