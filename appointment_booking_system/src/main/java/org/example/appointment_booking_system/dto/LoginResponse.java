package org.example.appointment_booking_system.dto;

import lombok.Getter;
import lombok.Setter;

// LoginResponse.java
@Setter
@Getter
public class LoginResponse {
    // Getters and Setters
    private String token;
    private String message;

    public LoginResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

}