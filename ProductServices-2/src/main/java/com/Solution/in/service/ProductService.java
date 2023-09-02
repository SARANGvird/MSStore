package com.Solution.in.service;



import java.util.List;
import com.Solution.in.model.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product getProductById(Long productId);
    List<Product> getAllProducts();
}
