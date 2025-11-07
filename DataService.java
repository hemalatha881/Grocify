package com.example.grocify.service;

import com.example.grocify.model.GroceryItem;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

// Import for @PostConstruct
import jakarta.annotation.PostConstruct;   // Use this for Spring Boot 3+
 
@Service
public class DataService {

    private final List<GroceryItem> groceryList = new ArrayList<>();

    @PostConstruct
    public void init() {
        // ====== August 2025 ======
        groceryList.add(new GroceryItem("2025-08-01", "Rice", 5, 300));
        groceryList.add(new GroceryItem("2025-08-01", "Toor Dal", 1, 120));
        groceryList.add(new GroceryItem("2025-08-01", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-08-02", "Eggs", 6, 60));
        groceryList.add(new GroceryItem("2025-08-02", "Bread", 1, 40));
        groceryList.add(new GroceryItem("2025-08-02", "Tomatoes", 1, 30));
        groceryList.add(new GroceryItem("2025-08-03", "Onions", 1, 30));
        groceryList.add(new GroceryItem("2025-08-03", "Potatoes", 2, 60));
        groceryList.add(new GroceryItem("2025-08-03", "Cooking Oil", 1, 120));
        groceryList.add(new GroceryItem("2025-08-04", "Sugar", 1, 40));
        groceryList.add(new GroceryItem("2025-08-04", "Tea Powder", 0.25, 50));
        groceryList.add(new GroceryItem("2025-08-04", "Biscuits", 2, 80));
        groceryList.add(new GroceryItem("2025-08-05", "Spinach", 1, 30));
        groceryList.add(new GroceryItem("2025-08-05", "Carrot", 1, 30));
        groceryList.add(new GroceryItem("2025-08-05", "Beans", 1, 40));
        groceryList.add(new GroceryItem("2025-08-06", "Bananas", 6, 60));
        groceryList.add(new GroceryItem("2025-08-06", "Apples", 4, 100));
        groceryList.add(new GroceryItem("2025-08-07", "Wheat Flour", 2, 120));
        groceryList.add(new GroceryItem("2025-08-07", "Salt", 1, 20));
        groceryList.add(new GroceryItem("2025-08-07", "Chillies", 0.25, 30));
        groceryList.add(new GroceryItem("2025-08-08", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-08-08", "Bread", 1, 40));
        groceryList.add(new GroceryItem("2025-08-08", "Butter", 0.2, 80));
        groceryList.add(new GroceryItem("2025-08-09", "Rice", 3, 180));
        groceryList.add(new GroceryItem("2025-08-09", "Toor Dal", 1, 120));
        groceryList.add(new GroceryItem("2025-08-09", "Tamarind", 0.1, 30));
        groceryList.add(new GroceryItem("2025-08-10", "Onions", 1, 30));
        groceryList.add(new GroceryItem("2025-08-10", "Potatoes", 1, 30));
        groceryList.add(new GroceryItem("2025-08-10", "Tomatoes", 1, 30));
        groceryList.add(new GroceryItem("2025-08-11", "Papaya", 1, 50));
        groceryList.add(new GroceryItem("2025-08-11", "Mango", 1, 60));
        groceryList.add(new GroceryItem("2025-08-12", "Chicken", 1.5, 300));
        groceryList.add(new GroceryItem("2025-08-12", "Coriander", 0.05, 20));
        groceryList.add(new GroceryItem("2025-08-12", "Turmeric", 0.05, 15));
        groceryList.add(new GroceryItem("2025-08-13", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-08-13", "Sugar", 1, 40));
        groceryList.add(new GroceryItem("2025-08-13", "Biscuits", 2, 80));
        groceryList.add(new GroceryItem("2025-08-14", "Rice", 2, 120));
        groceryList.add(new GroceryItem("2025-08-14", "Lentils", 1, 100));
        groceryList.add(new GroceryItem("2025-08-14", "Mixed Vegetables", 1.5, 90));
        groceryList.add(new GroceryItem("2025-08-15", "Bread", 1, 40));
        groceryList.add(new GroceryItem("2025-08-15", "Eggs", 6, 60));
        groceryList.add(new GroceryItem("2025-08-15", "Butter", 0.1, 40));
        groceryList.add(new GroceryItem("2025-08-16", "Tea Powder", 0.25, 50));
        groceryList.add(new GroceryItem("2025-08-16", "Sugar", 0.5, 20));
        groceryList.add(new GroceryItem("2025-08-16", "Salt", 1, 20));
        groceryList.add(new GroceryItem("2025-08-17", "Watermelon", 1, 50));
        groceryList.add(new GroceryItem("2025-08-17", "Guava", 1, 40));
        groceryList.add(new GroceryItem("2025-08-18", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-08-18", "Curd", 0.5, 50));
        groceryList.add(new GroceryItem("2025-08-18", "Paneer", 0.2, 80));
        groceryList.add(new GroceryItem("2025-08-19", "Rice", 3, 180));
        groceryList.add(new GroceryItem("2025-08-19", "Wheat Flour", 2, 120));
        groceryList.add(new GroceryItem("2025-08-19", "Spices", 0.2, 50));
        groceryList.add(new GroceryItem("2025-08-20", "Cabbage", 1, 30));
        groceryList.add(new GroceryItem("2025-08-20", "Beans", 1, 40));
        groceryList.add(new GroceryItem("2025-08-20", "Brinjal", 1, 30));
        groceryList.add(new GroceryItem("2025-08-21", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-08-21", "Bread", 1, 40));
        groceryList.add(new GroceryItem("2025-08-22", "Chicken", 1, 200));
        groceryList.add(new GroceryItem("2025-08-22", "Onions", 1, 30));
        groceryList.add(new GroceryItem("2025-08-22", "Tomatoes", 1, 30));
        groceryList.add(new GroceryItem("2025-08-23", "Banana", 1, 10));
        groceryList.add(new GroceryItem("2025-08-23", "Apple", 1, 25));
        groceryList.add(new GroceryItem("2025-08-23", "Cashews", 0.1, 80));
        groceryList.add(new GroceryItem("2025-08-24", "Rice", 2, 120));
        groceryList.add(new GroceryItem("2025-08-24", "Dal", 1, 100));
        groceryList.add(new GroceryItem("2025-08-24", "Tamarind", 0.1, 30));
        groceryList.add(new GroceryItem("2025-08-25", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-08-25", "Sugar", 1, 40));
        groceryList.add(new GroceryItem("2025-08-25", "Biscuits", 2, 80));
        groceryList.add(new GroceryItem("2025-08-26", "Potato", 1, 30));
        groceryList.add(new GroceryItem("2025-08-26", "Brinjal", 1, 30));
        groceryList.add(new GroceryItem("2025-08-26", "Carrot", 1, 30));
        groceryList.add(new GroceryItem("2025-08-27", "Eggs", 6, 60));
        groceryList.add(new GroceryItem("2025-08-27", "Bread", 1, 40));
        groceryList.add(new GroceryItem("2025-08-27", "Butter", 0.1, 40));
        groceryList.add(new GroceryItem("2025-08-28", "Spinach", 1, 30));
        groceryList.add(new GroceryItem("2025-08-28", "Beans", 1, 40));
        groceryList.add(new GroceryItem("2025-08-28", "Tomato", 1, 30));
        groceryList.add(new GroceryItem("2025-08-29", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-08-29", "Curd", 0.5, 50));
        groceryList.add(new GroceryItem("2025-08-29", "Apples", 4, 100));
        groceryList.add(new GroceryItem("2025-08-30", "Rice", 3, 180));
        groceryList.add(new GroceryItem("2025-08-30", "Toor Dal", 1, 120));
        groceryList.add(new GroceryItem("2025-08-30", "Spices", 0.2, 50));
        groceryList.add(new GroceryItem("2025-08-31", "Wheat Flour", 2, 120));
        groceryList.add(new GroceryItem("2025-08-31", "Salt", 1, 20));
        groceryList.add(new GroceryItem("2025-08-31", "Sugar", 0.5, 20));

        // ====== September 2025 ======
       // ====== September 2025 ======
groceryList.add(new GroceryItem("2025-09-01", "Rice", 5, 300));
groceryList.add(new GroceryItem("2025-09-01", "Toor Dal", 1, 120));
groceryList.add(new GroceryItem("2025-09-01", "Milk", 2, 100));

groceryList.add(new GroceryItem("2025-09-02", "Eggs", 6, 60));
groceryList.add(new GroceryItem("2025-09-02", "Bread", 1, 40));
groceryList.add(new GroceryItem("2025-09-02", "Tomatoes", 1, 30));

groceryList.add(new GroceryItem("2025-09-03", "Onions", 1, 30));
groceryList.add(new GroceryItem("2025-09-03", "Potatoes", 2, 60));
groceryList.add(new GroceryItem("2025-09-03", "Cooking Oil", 1, 120));

groceryList.add(new GroceryItem("2025-09-04", "Sugar", 1, 40));
groceryList.add(new GroceryItem("2025-09-04", "Tea Powder", 0.25, 50));
groceryList.add(new GroceryItem("2025-09-04", "Biscuits", 2, 80));

groceryList.add(new GroceryItem("2025-09-05", "Spinach", 1, 30));
groceryList.add(new GroceryItem("2025-09-05", "Carrot", 1, 30));
groceryList.add(new GroceryItem("2025-09-05", "Beans", 1, 40));

groceryList.add(new GroceryItem("2025-09-06", "Bananas", 6, 60));
groceryList.add(new GroceryItem("2025-09-06", "Apples", 4, 100));

groceryList.add(new GroceryItem("2025-09-07", "Wheat Flour", 2, 120));
groceryList.add(new GroceryItem("2025-09-07", "Salt", 1, 20));
groceryList.add(new GroceryItem("2025-09-07", "Chillies", 0.25, 30));

groceryList.add(new GroceryItem("2025-09-08", "Milk", 2, 100));
groceryList.add(new GroceryItem("2025-09-08", "Bread", 1, 40));
groceryList.add(new GroceryItem("2025-09-08", "Butter", 0.2, 80));

groceryList.add(new GroceryItem("2025-09-09", "Rice", 3, 180));
groceryList.add(new GroceryItem("2025-09-09", "Toor Dal", 1, 120));
groceryList.add(new GroceryItem("2025-09-09", "Tamarind", 0.1, 30));

groceryList.add(new GroceryItem("2025-09-10", "Onions", 1, 30));
groceryList.add(new GroceryItem("2025-09-10", "Potatoes", 1, 30));
groceryList.add(new GroceryItem("2025-09-10", "Tomatoes", 1, 30));

groceryList.add(new GroceryItem("2025-09-11", "Papaya", 1, 50));
groceryList.add(new GroceryItem("2025-09-11", "Mango", 1, 60));

groceryList.add(new GroceryItem("2025-09-12", "Chicken", 1.5, 300));
groceryList.add(new GroceryItem("2025-09-12", "Coriander", 0.05, 20));
groceryList.add(new GroceryItem("2025-09-12", "Turmeric", 0.05, 15));

groceryList.add(new GroceryItem("2025-09-13", "Milk", 2, 100));
groceryList.add(new GroceryItem("2025-09-13", "Sugar", 1, 40));
groceryList.add(new GroceryItem("2025-09-13", "Biscuits", 2, 80));

groceryList.add(new GroceryItem("2025-09-14", "Rice", 2, 120));
groceryList.add(new GroceryItem("2025-09-14", "Lentils", 1, 100));
groceryList.add(new GroceryItem("2025-09-14", "Mixed Vegetables", 1.5, 90));

groceryList.add(new GroceryItem("2025-09-15", "Bread", 1, 40));
groceryList.add(new GroceryItem("2025-09-15", "Eggs", 6, 60));
groceryList.add(new GroceryItem("2025-09-15", "Butter", 0.1, 40));

groceryList.add(new GroceryItem("2025-09-16", "Tea Powder", 0.25, 50));
groceryList.add(new GroceryItem("2025-09-16", "Sugar", 0.5, 20));
groceryList.add(new GroceryItem("2025-09-16", "Salt", 1, 20));

groceryList.add(new GroceryItem("2025-09-17", "Watermelon", 1, 50));
groceryList.add(new GroceryItem("2025-09-17", "Guava", 1, 40));

groceryList.add(new GroceryItem("2025-09-18", "Milk", 2, 100));
groceryList.add(new GroceryItem("2025-09-18", "Curd", 0.5, 50));
groceryList.add(new GroceryItem("2025-09-18", "Paneer", 0.2, 80));

groceryList.add(new GroceryItem("2025-09-19", "Rice", 3, 180));
groceryList.add(new GroceryItem("2025-09-19", "Wheat Flour", 2, 120));
groceryList.add(new GroceryItem("2025-09-19", "Spices", 0.2, 50));

groceryList.add(new GroceryItem("2025-09-20", "Cabbage", 1, 30));
groceryList.add(new GroceryItem("2025-09-20", "Beans", 1, 40));
groceryList.add(new GroceryItem("2025-09-20", "Brinjal", 1, 30));

groceryList.add(new GroceryItem("2025-09-21", "Milk", 2, 100));
groceryList.add(new GroceryItem("2025-09-21", "Bread", 1, 40));

groceryList.add(new GroceryItem("2025-09-22", "Chicken", 1, 200));
groceryList.add(new GroceryItem("2025-09-22", "Onions", 1, 30));
groceryList.add(new GroceryItem("2025-09-22", "Tomatoes", 1, 30));

groceryList.add(new GroceryItem("2025-09-23", "Banana", 1, 10));
groceryList.add(new GroceryItem("2025-09-23", "Apple", 1, 25));
groceryList.add(new GroceryItem("2025-09-23", "Cashews", 0.1, 80));

groceryList.add(new GroceryItem("2025-09-24", "Rice", 2, 120));
groceryList.add(new GroceryItem("2025-09-24", "Dal", 1, 100));
groceryList.add(new GroceryItem("2025-09-24", "Tamarind", 0.1, 30));

groceryList.add(new GroceryItem("2025-09-25", "Milk", 2, 100));
groceryList.add(new GroceryItem("2025-09-25", "Sugar", 1, 50));
groceryList.add(new GroceryItem("2025-09-25", "Biscuits", 2, 80));

groceryList.add(new GroceryItem("2025-09-26", "Potato", 1, 30));
groceryList.add(new GroceryItem("2025-09-26", "Brinjal", 1, 30));
groceryList.add(new GroceryItem("2025-09-26", "Carrot", 1, 30));

groceryList.add(new GroceryItem("2025-09-27", "Eggs", 6, 60));
groceryList.add(new GroceryItem("2025-09-27", "Bread", 1, 40));
groceryList.add(new GroceryItem("2025-09-27", "Butter", 0.1, 40));

groceryList.add(new GroceryItem("2025-09-28", "Spinach", 1, 30));
groceryList.add(new GroceryItem("2025-09-28", "Beans", 1, 40));
groceryList.add(new GroceryItem("2025-09-28", "Tomato", 1, 30));

groceryList.add(new GroceryItem("2025-09-29", "Milk", 2, 100));
groceryList.add(new GroceryItem("2025-09-29", "Curd", 0.5, 50));
groceryList.add(new GroceryItem("2025-09-29", "Apples", 4, 100));

groceryList.add(new GroceryItem("2025-09-30", "Rice", 3, 180));
groceryList.add(new GroceryItem("2025-09-30", "Toor Dal", 1, 120));
groceryList.add(new GroceryItem("2025-09-30", "Spices", 0.2, 50));

        
        // ====== October 2025 ======
        groceryList.add(new GroceryItem("2025-10-01", "Rice", 5, 300));
        groceryList.add(new GroceryItem("2025-10-01", "Toor Dal", 1, 120));
        groceryList.add(new GroceryItem("2025-10-01", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-10-02", "Onions", 1, 30));
        groceryList.add(new GroceryItem("2025-10-02", "Potatoes", 2, 60));
        groceryList.add(new GroceryItem("2025-10-02", "Tomatoes", 1, 30));
        groceryList.add(new GroceryItem("2025-10-03", "Cooking Oil", 1, 120));
        groceryList.add(new GroceryItem("2025-10-03", "Salt", 1, 20));
        groceryList.add(new GroceryItem("2025-10-03", "Sugar", 1, 40));
        groceryList.add(new GroceryItem("2025-10-04", "Spinach", 1, 30));
        groceryList.add(new GroceryItem("2025-10-04", "Carrot", 1, 30));
        groceryList.add(new GroceryItem("2025-10-04", "Beans", 1, 40));
        groceryList.add(new GroceryItem("2025-10-05", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-10-05", "Bread", 1, 40));
        groceryList.add(new GroceryItem("2025-10-05", "Butter", 0.2, 80));
        groceryList.add(new GroceryItem("2025-10-06", "Bananas", 6, 60));
        groceryList.add(new GroceryItem("2025-10-06", "Apples", 4, 100));
        groceryList.add(new GroceryItem("2025-10-07", "Wheat Flour", 2, 120));
        groceryList.add(new GroceryItem("2025-10-07", "Toor Dal", 1, 120));
        groceryList.add(new GroceryItem("2025-10-07", "Tamarind", 0.1, 30));
        groceryList.add(new GroceryItem("2025-10-08", "Tea Powder", 0.25, 50));
        groceryList.add(new GroceryItem("2025-10-08", "Sugar", 0.5, 20));
        groceryList.add(new GroceryItem("2025-10-08", "Curd", 0.5, 50));
        groceryList.add(new GroceryItem("2025-10-09", "Brinjal", 1, 30));
        groceryList.add(new GroceryItem("2025-10-09", "Potato", 1, 30));
        groceryList.add(new GroceryItem("2025-10-09", "Beans", 1, 40));
        groceryList.add(new GroceryItem("2025-10-10", "Chicken", 1.5, 300));
        groceryList.add(new GroceryItem("2025-10-10", "Onions", 1, 30));
        groceryList.add(new GroceryItem("2025-10-10", "Tomatoes", 1, 30));
        groceryList.add(new GroceryItem("2025-10-11", "Rice", 3, 180));
        groceryList.add(new GroceryItem("2025-10-11", "Lentils", 1, 100));
        groceryList.add(new GroceryItem("2025-10-11", "Milk", 2, 100));
        groceryList.add(new GroceryItem("2025-10-12", "Papaya", 1, 50));
        groceryList.add(new GroceryItem("2025-10-12", "Pomegranate", 1, 60));
        groceryList.add(new GroceryItem("2025-10-12", "Curd", 0.5, 50));
        groceryList.add(new GroceryItem("2025-10-13", "Cabbage", 1, 30));
        groceryList.add(new GroceryItem("2025-10-13", "Carrot", 1, 30));
        groceryList.add(new GroceryItem("2025-10-13", "Capsicum", 1, 40));
        groceryList.add(new GroceryItem("2025-10-14", "Bread", 1, 40));
        groceryList.add(new GroceryItem("2025-10-14", "Eggs", 6, 60));
        groceryList.add(new GroceryItem("2025-10-14", "Butter", 0.1, 40));
        groceryList.add(new GroceryItem("2025-10-15", "Rice", 2, 120));
        groceryList.add(new GroceryItem("2025-10-15", "Dal", 1, 100));
        groceryList.add(new GroceryItem("2025-10-15", "Spices", 0.2, 50));
    }

   public List<GroceryItem> getAllItems() {
        return groceryList;
    }

    public void addItem(GroceryItem item) {
        groceryList.add(item);
    }
}
