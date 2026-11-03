package org.example.appointment_booking_system.service;

import jakarta.transaction.Transactional;
import org.example.appointment_booking_system.dto.LoginRequest;
import org.example.appointment_booking_system.dto.LoginResponse;
import org.example.appointment_booking_system.dto.RegisterRequest;
import org.example.appointment_booking_system.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.example.appointment_booking_system.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    // If you add Spring Security later, inject PasswordEncoder here:
    // private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User register(RegisterRequest request) {
        User user = new User(request.fullName(), request.email(), request.password());
//        checkExistingAccount(login_request, request);
        return userRepository.save(user);
    }

    @Transactional
    public ResponseEntity<LoginResponse> login(LoginRequest login_request) {
        for (int i = 0; i < userRepository.findAll().size(); i++) {
            if (userRepository.findAll().get(i).getEmail().equals(login_request.getEmail()) && userRepository.findAll().get(i).getPasswordHash().equals(login_request.getPassword())) {
                int random1to10 = (int) (Math.random() * 1000000000) + 1;
                String mockToken = "mock-jwt-token-xyz" + random1to10;
                return ResponseEntity.ok(new LoginResponse(mockToken, "Login successful"));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                        .body(new LoginResponse(null, "Invalid username or password"));
            }
        }
        return null;
    }

}
