package com.com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com.model.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long>{

}
