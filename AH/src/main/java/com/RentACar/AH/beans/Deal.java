package com.RentACar.AH.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Deal {
	
	@Id
	private int id;
	private int customerID;
	private int carID;
	private Date startDate;
	private Date endDate;
	
	
}
