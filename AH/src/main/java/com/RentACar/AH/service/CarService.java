package com.RentACar.AH.service;



import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.RentACar.AH.repo.CarRepository;
import com.RentACar.AH.beans.Car;

@Service
@Scope("prototype")
public class CarService {
	
	private CarRepository carRepository;
	
	public List<Car> getCarList(){
		List<Car> allCars=carRepository.findAll();
		return null;
	}

}
