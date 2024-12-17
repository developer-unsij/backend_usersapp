package com.unsij.backend.usersapp.backend_usersapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unsij.backend.usersapp.backend_usersapp.models.UserRequest;
import com.unsij.backend.usersapp.backend_usersapp.models.entities.User;
import com.unsij.backend.usersapp.backend_usersapp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public Optional<User> update(UserRequest userRequest, Long id) {
        Optional<User> userOptional = this.findById(id);
        User userResult = null;
        if (userOptional.isPresent()) {
            User userDB = userOptional.orElseThrow();
            userDB.setUsername(userRequest.getUsername());
            userDB.setEmail(userRequest.getEmail());
            userResult = this.save(userDB);
            
        }
        return Optional.ofNullable(userResult);
    }

    @Override
    @Transactional
    public void remove(Long id) {
        userRepository.deleteById(id);
    }

}
