package com.Solution.in.service;

import java.util.List;
import com.Solution.in.model.Payment;

public interface PaymentService {
    Payment createPayment(Payment payment);
    Payment getPaymentById(String paymentId);
    List<Payment> getAllPayments();
    // Other payment-related methods
}
