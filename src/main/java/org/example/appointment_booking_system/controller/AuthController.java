package org.example.appointment_booking_system.controller;

import jakarta.validation.Valid;
import org.example.appointment_booking_system.dto.LoginRequest;
import org.example.appointment_booking_system.dto.LoginResponse;
import org.example.appointment_booking_system.dto.RegisterRequest;
import org.example.appointment_booking_system.model.User;
import org.example.appointment_booking_system.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AuthController {

    private final UserService userService;

    // Spring Boot automatically injects the UserService bean via constructor injection
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody RegisterRequest request) {
        ResponseEntity<User> found = null;
        User body = userService.register( request);
        if(body != null){
            found =  ResponseEntity.ok(body);
        }
        return found;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> register(@Valid @RequestBody LoginRequest login_request) {
        ResponseEntity<LoginResponse> body = userService.login(login_request);
        return ResponseEntity.ok(body.getBody());
    }
}