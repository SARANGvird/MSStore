package com.Solution.in.serviceimpl;



import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Solution.in.model.Product;
import com.Solution.in.repository.ProductRepository;
import com.Solution.in.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    private final RestTemplate restTemplate;

    @Autowired
    public ProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new NoSuchElementException("Product not found"));
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductByIdFromAnotherService(Long productId) {
        String productServiceUrl = "http://localhost:8082/products" + productId;
        return restTemplate.getForObject(productServiceUrl, Product.class);
    }
}
