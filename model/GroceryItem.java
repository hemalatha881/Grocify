package com.example.grocify.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GroceryItem {
    private String date;      // format: yyyy-MM-dd
    private String name;
    private double quantity;
    private String unit;
    private String source;
    private double price;

    // ✅ No-args constructor
    public GroceryItem() {}

    // ✅ 4-parameter constructor (backward compatibility)
    public GroceryItem(String date, String name, double quantity, double price) {
        this.date = (date == null || date.isEmpty()) 
                    ? LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) 
                    : date;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.unit = "kg";       // default unit
        this.source = "Unknown"; // default source
    }

    // ✅ 6-parameter constructor (for full data)
    public GroceryItem(String date, String name, double quantity, String unit, String source, double price) {
        this.date = (date == null || date.isEmpty()) 
                    ? LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) 
                    : date;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.source = source;
        this.price = price;
    }

    // Getters and setters
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
