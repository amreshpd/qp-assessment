package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.GroceryUserService;

@RestController
@RequestMapping("/user")
public class GroceryUserController {

	@Autowired
	private GroceryUserService service;
	
	@GetMapping("/view")
	public ResponseEntity<List<String>> viewAll(){
		List<String> view = service.viewAllItem();
		return new ResponseEntity<List<String>>(view,HttpStatus.ACCEPTED);
	}
}
