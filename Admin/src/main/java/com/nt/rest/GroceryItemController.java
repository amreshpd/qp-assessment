package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.body.ExtraItem;
import com.nt.entity.GroceryItem;
import com.nt.service.IGroceryService;

@RestController
@RequestMapping("/item")
public class GroceryItemController {
	@Autowired
	private IGroceryService service;

	@PostMapping("/add")
	public ResponseEntity<String> newItem(@RequestBody GroceryItem item) {
		String msg = service.addItem(item);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping("/viewAll")
	public ResponseEntity<?> allGroceryItem() {
		List<GroceryItem> list = service.viewGroceryItem();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteItem(@PathVariable Integer id){
		String removeItem = service.removeItem(id);
		return new ResponseEntity<>(removeItem,HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateGroceryItem(@PathVariable Integer id,@RequestBody ExtraItem item){
		String updateItem = service.updateItem(id, item);
		return new ResponseEntity<>(updateItem,HttpStatus.OK);
	}

}
