package com.ms.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Emp {
		@Id
		private int empID;
		private String name;
		private int salary;
		@OneToOne(fetch = FetchType.LAZY)//emp --- lap
		private Laptop laptop;
		@OneToMany(mappedBy= "emp")      //just avoid the table creation
		private List<Account> account;
		@ManyToMany(mappedBy="emps")
		private List<Project> project;
		
	
		public Emp(int empID, String name, int salary, Laptop laptop) {
			super();
			this.empID = empID;
			this.name = name;
			this.salary = salary;
			this.laptop = laptop;
		}


		public Emp(int empID) {
			super();
			this.empID = empID;
		}
}
