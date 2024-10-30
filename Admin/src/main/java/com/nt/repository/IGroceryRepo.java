package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.GroceryItem;

public interface IGroceryRepo extends JpaRepository<GroceryItem, Integer> {

}
