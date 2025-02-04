package com.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.model.FoodItem;
import com.com.service.FoodItemService;

@RestController
@RequestMapping("/api/food")
public class FoodItemController {
    
    @Autowired
    private FoodItemService foodItemService;

    @GetMapping("/getAllFoodItems")
    public ResponseEntity<List<FoodItem>> getAllFoodItems() {
        return ResponseEntity.ok(foodItemService.getAllFoodItems());
    }
}
