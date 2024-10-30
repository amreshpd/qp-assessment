package com.nt.service;

import java.util.List;

import com.nt.body.ExtraItem;
import com.nt.entity.GroceryItem;

public interface IGroceryService {

	public String addItem(GroceryItem item);

	public List<GroceryItem> viewGroceryItem();

	public String removeItem(Integer id);

	public String updateItem(Integer id,ExtraItem item);
}
