package com.jpql_product;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Product {
	@Id
	private int id;
	private String name;
	private int quantity;
	private LocalDate manfuDate ;
	
	
	
}
