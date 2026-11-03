// LoginRequest.java
package org.example.appointment_booking_system.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class LoginRequest {
    // Getters and Setters
    private String email;
        @Setter
        private String password;

    public void setUsername(String username) { this.email = email; }
    public String getEmail() {
    return email;
}

public String getPassword() {
    return password;
}
}
