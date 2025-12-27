package com.example.productexplorer.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;
    private String brand;
    private Double rating;
    private Boolean inStock;

    public Product() {}

    public Product(String name, String category, Double price,
                   String brand, Double rating, Boolean inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.brand = brand;
        this.rating = rating;
        this.inStock = inStock;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public Double getPrice() { return price; }
    public String getBrand() { return brand; }
    public Double getRating() { return rating; }
    public Boolean getInStock() { return inStock; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setPrice(Double price) { this.price = price; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setRating(Double rating) { this.rating = rating; }
    public void setInStock(Boolean inStock) { this.inStock = inStock; }
}
