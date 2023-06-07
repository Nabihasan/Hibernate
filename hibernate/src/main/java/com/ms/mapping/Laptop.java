package com.ms.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Laptop {
	@Id
	private String laId;
	private String brand;
	private int price;
	@OneToOne(mappedBy = "laptop") // laptop -->emp
	private Emp emp;

	public Laptop(String laId, String brand, int price) {
		super();
		this.laId = laId;
		this.brand = brand;
		this.price = price;
	}

	public Laptop(String laId) {
		super();
		this.laId = laId;
	}
}
