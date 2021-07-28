package com.RentACar.AH.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
	
	
		@Id
		private int id;
		private String name;
		private int model;
		private int seats;
		private boolean available;
	
	
}
