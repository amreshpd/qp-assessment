package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GroceryUserService {
	@Value("${admin.url}")
	private String url;
	
	public List<String> viewAllItem(){
	RestTemplate template=new RestTemplate();
	ResponseEntity<String> entity = template.getForEntity(url,String.class);
	ArrayList<String> item=new ArrayList<String>();
	String value = entity.getBody();
	item.add(value);
	return item;	
	}
}
