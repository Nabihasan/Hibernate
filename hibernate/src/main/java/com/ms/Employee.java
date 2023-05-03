package com.ms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Data
@AllArgsConstructor
@Entity
@ToString
@NoArgsConstructor


public class Employee {
	

	@Id
	
	private int emp_code;
	

	private String emp_name;
	
	private String designation;
	
	
	private int salary;
	

}
