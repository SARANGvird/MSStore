package com.Solution.in.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Document(collection = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @org.springframework.data.annotation.Id
    private ObjectId id;

    private double amount;
    private PaymentStatus status;

    private Long userId; // Reference to user ID
    private Long productId; // Reference to product ID

    // Constructors, getters, setters

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Payment() {
        super();
    }

    public Payment(ObjectId id, double amount, PaymentStatus status, Long userId, Long productId) {
        super();
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.userId = userId;
        this.productId = productId;
    }

    public enum PaymentStatus {
        PENDING,
        SUCCESS,
        FAILURE
    }

    // Constructors, getters, setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
