package com.unsij.backend.usersapp.backend_usersapp.services;

import java.util.List;
import java.util.Optional;

import com.unsij.backend.usersapp.backend_usersapp.models.entities.User;
import com.unsij.backend.usersapp.backend_usersapp.models.entities.UserRequest;

import jakarta.validation.Valid;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    Optional<User> update(UserRequest userRequest, Long id);
    void remove(Long id);  
}
