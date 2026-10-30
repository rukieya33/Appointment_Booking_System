package org.example.appointment_booking_system.dto;

import org.example.appointment_booking_system.model.User;
import java.time.Instant;

public record UserResponse(Long id, String fullName, String email, Instant createdAt) {
    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getFull_name(), user.getEmail(), user.getCreatedAt());
    }
}
