package com.nt.entity;

import lombok.Data;


@Data
public class GroceryItem {
	private Integer groceryId;
	private String groceryName;
	private String groceryType;
	private Double price;
}
