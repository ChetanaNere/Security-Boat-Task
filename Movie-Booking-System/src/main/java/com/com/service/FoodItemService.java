package com.com.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.model.FoodItem;
import com.com.repository.FoodItemRepository;
@Service
public class FoodItemService {
    
    @Autowired
    private FoodItemRepository foodItemRepository;

    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }
}