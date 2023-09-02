package com.Solution.in.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Solution.in.model.Payment;
import com.Solution.in.repository.PaymentRepository;
import com.Solution.in.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final RestTemplate restTemplate;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository, RestTemplate restTemplate) {
        this.paymentRepository = paymentRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment getPaymentById(String paymentId) {
        return paymentRepository.findById(paymentId)
                .orElse(null); // Handle the case where payment is not found
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Example methods for making HTTP requests using RestTemplate
    public String fetchUserDataFromUserService(Long userId) {
        String userServiceUrl = "http://localhost:8081/users" + userId;
        return restTemplate.getForObject(userServiceUrl, String.class);
    }

    public String fetchProductDataFromProductService(Long productId) {
        String productServiceUrl = "http://localhost:8082/products" + productId;
        return restTemplate.getForObject(productServiceUrl, String.class);
    }
}
