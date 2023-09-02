package com.Solution.in.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.Solution.in.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query methods if needed
}
