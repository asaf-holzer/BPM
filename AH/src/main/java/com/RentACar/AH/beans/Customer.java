package com.RentACar.AH.beans;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
	
	
		@Id
		private int id;
		private int idNumber;
		private String name;
		private double age;
		private int licenseNumber;
		private Date IssueDate;
		private Date validLicense;
		@Transient 
		private CustomerRequirements customerRequirements;
}
