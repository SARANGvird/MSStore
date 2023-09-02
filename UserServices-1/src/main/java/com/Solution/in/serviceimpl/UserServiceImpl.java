package com.Solution.in.serviceimpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Solution.in.model.User;
import com.Solution.in.repository.UserRepository;
import com.Solution.in.service.UserService;
import com.Solution.in.exception.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    private final RestTemplate restTemplate;

    @Autowired
    public UserServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserByIdFromAnotherService(Long userId) {
        String userServiceUrl = "http://localhost:8081/users" + userId;
        return restTemplate.getForObject(userServiceUrl, User.class);
    }

}
