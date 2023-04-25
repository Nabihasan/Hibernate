package com.ms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name="empno")
	private int emp_code;
	
	@Column(name="name")
	private String emp_name;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="salary")
	private int salary;
	
	public int getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(int emp_code) {
		this.emp_code = emp_code;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int emp_code, String emp_name, String designation, int salary) {
		super();
		this.emp_code = emp_code;
		this.emp_name = emp_name;
		this.designation = designation;
		this.salary = salary;
	}
}
