package com.RentACar.AH.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RentACar.AH.beans.Car;

public interface CarRepository extends JpaRepository<Car, Integer> { 
	

}
