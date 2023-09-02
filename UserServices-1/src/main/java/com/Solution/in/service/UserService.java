package com.Solution.in.service;

import java.util.List;

import com.Solution.in.model.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
}
