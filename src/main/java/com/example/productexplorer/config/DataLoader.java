package com.example.productexplorer.config;

import com.example.productexplorer.model.Product;
import com.example.productexplorer.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(ProductRepository productRepository) {
        return args -> {

            productRepository.save(
                    new Product("iPhone 15", "Electronics", 79999.0, "Apple", 4.6, true)
            );

            productRepository.save(
                    new Product("Galaxy S23", "Electronics", 69999.0, "Samsung", 4.5, true)
            );

            productRepository.save(
                    new Product("Boat Headphones", "Accessories", 2499.0, "Boat", 4.1, true)
            );

            productRepository.save(
                    new Product("HP Pavilion", "Laptops", 58999.0, "HP", 4.4, true)
            );
        };
    }
}
