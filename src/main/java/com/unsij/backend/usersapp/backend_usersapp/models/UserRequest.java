package com.unsij.backend.usersapp.backend_usersapp.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class UserRequest {
    @NotBlank(message = "Este es un mensaje personalizado.")
    private String username;

    @Email
    @NotBlank
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
