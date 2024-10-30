package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "GROCERY_ITEM")
@Data
public class GroceryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer groceryId;
	@Column(length = 25)
	private String groceryName;
	@Column(length = 35)
	private String groceryType;
	private Double price;
}
