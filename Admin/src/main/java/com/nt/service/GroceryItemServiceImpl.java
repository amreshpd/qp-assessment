package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.body.ExtraItem;
import com.nt.entity.GroceryItem;
import com.nt.repository.IGroceryRepo;

@Service
public class GroceryItemServiceImpl implements IGroceryService {

	@Autowired
	private IGroceryRepo repo;

	@Override
	public String addItem(GroceryItem item) {
		repo.save(item);
		return "register successfully";
	}

	@Override
	public List<GroceryItem> viewGroceryItem() {
	 List<GroceryItem> list = repo.findAll();
		return list;
	}

	@Override
	public String removeItem(Integer id) {
		Optional<GroceryItem> isItem = repo.findById(id);

		if (isItem.isPresent()) {
			repo.deleteById(id);
			return "deleted successfully";
		} else
			return "item not found for deletion";
	}

	@Override
	public String updateItem(Integer id, ExtraItem item) {
		Optional<GroceryItem> isItem = repo.findById(id);

		if (isItem.isPresent()) {
			GroceryItem groceryItem = isItem.get();
			groceryItem.setGroceryName(item.getGroceryName());
			groceryItem.setPrice(item.getPrice());
			repo.save(groceryItem);
			return "update successfully";
		}
		return "item not found for updation";
	}

}
