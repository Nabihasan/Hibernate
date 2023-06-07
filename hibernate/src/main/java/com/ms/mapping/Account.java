package com.ms.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Id
	private String accno;
	private String bank;
	private String branch;
	@ManyToOne
	private Emp emp;
	public Account(String accno) {
		super();
		this.accno = accno;
	}
	
	
}
