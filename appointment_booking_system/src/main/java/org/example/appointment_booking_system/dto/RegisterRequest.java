package org.example.appointment_booking_system.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank(message = "Enter your full name")
        @Size(max = 100, message = "Name must be 100 characters or fewer")
        String fullName,

        @NotBlank(message = "Enter your email address")
        @Email(message = "Enter a valid email address")
        @Size(max = 255, message = "Email must be 255 characters or fewer")
        String email,

        @NotBlank(message = "Enter a password")
        @Size(min = 8, max = 72, message = "Password must be 8 to 72 characters")
        String password
) {}
