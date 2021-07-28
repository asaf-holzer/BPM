package com.RentACar.AH.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.RentACar.AH.beans.Car;
import com.RentACar.AH.beans.Customer;
import com.RentACar.AH.beans.Deal;
import com.RentACar.AH.exption.DealDeniedExption;
import com.RentACar.AH.repo.CustomerRepository;

@Service
@Scope("prototype")
public class DealService {
	
	@Autowired
	private CustomerRepository 	customerRepository;
	
	private CustomerService customerService;
	private CarService carService;
	private int customerID;

	public DealService() {
		super();
	}

	public int getCompanyID() {
		return customerID;
	}

	public int getCustomerID(int idNumber ) {
		return customerRepository.findByidNumber(idNumber).getId();
	}

	public void setCustomerID(int companyID) {
		this.customerID = companyID;
	}

	
	
	private Deal ExecutionADeal(Customer customer) throws DealDeniedExption {
		
		if (customer.getAge()<21) {
			throw new DealDeniedExption("cant rent a car, too young");
		}else if ((customer.getValidLicense().before(new Date()))) {
			throw new DealDeniedExption("cant rent a car, license not valid");
		}
		List<Car> allCars=carService.getCarList();
		List<Car> filterCars=new ArrayList<Car>();
		for (Car car : allCars) {
			if ((car.getModel()==customerService.getCustomer(customerID).getCustomerRequirements().getModelRequired())&&(car.getSeats()==customerService.getCustomer(customerID).getCustomerRequirements().getSeatsRequired())&&(car.isAvailable())) {
				filterCars.add(car);
			}			
		}
		if (filterCars.isEmpty()) {
			throw new DealDeniedExption("No available vehicle matching your requests was found");
		}
		customerService.addCustomer(customer);
		
		
		return null;
		
	}

}
