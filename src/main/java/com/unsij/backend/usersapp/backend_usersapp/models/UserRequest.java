package com.unsij.backend.usersapp.backend_usersapp.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserRequest {
    @NotBlank
    private String username;

    @NotBlank
    @Email
    private String email;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

}
