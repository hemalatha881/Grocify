package com.example.grocify.controller;

import com.example.grocify.model.GroceryItem;
import com.example.grocify.service.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@RestController
@RequestMapping("/api/grocery")
@CrossOrigin(origins = "*") // Allow frontend (HTML/JS) requests
public class GrocifyController {

    private final DataService dataService;

    public GrocifyController(DataService dataService) {
        this.dataService = dataService;
    }

    // 🧩 1️⃣ Webpage route (Thymeleaf)
    @GetMapping("/userlist")
    public String showUserList(Model model) {
        List<GroceryItem> allItems = dataService.getAllItems();

        Map<String, List<GroceryItem>> itemsByMonth = allItems.stream()
                .collect(Collectors.groupingBy(item -> {
                    LocalDate date = LocalDate.parse(item.getDate());
                    return date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
                }, LinkedHashMap::new, Collectors.toList()));

        model.addAttribute("itemsByMonth", itemsByMonth);
        return "userlist"; // Thymeleaf view (if used)
    }

    // 🧩 2️⃣ REST API for frontend JS
    @GetMapping
    @ResponseBody
    public ResponseEntity<List<GroceryItem>> getAllItems() {
        return ResponseEntity.ok(dataService.getAllItems());
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<GroceryItem> addItem(@RequestBody GroceryItem item) {
        dataService.addItem(item);
        return ResponseEntity.ok(item);
    }
}
