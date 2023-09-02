package com.Solution.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Solution.in.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods if needed
}
