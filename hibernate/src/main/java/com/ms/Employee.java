package com.ms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
	

	public Employee(String emp_name, String designation, int salary) {
		super();
		this.emp_name = emp_name;
		this.designation = designation;
		this.salary = salary;
	}


	@Id
	@SequenceGenerator(name ="sq1",sequenceName="sque_emp")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sq1")
	private int emp_code;
	

	private String emp_name;
	
	private String designation;
	
	
	private int salary;
	

}
