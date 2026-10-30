package org.example.appointment_booking_system.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;

@Getter
@Entity
@Table(name = "Authentication") // "user" is a reserved word in several databases
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String full_name;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @Column(nullable = false)
    private String passwordHash;

    @Column(nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    public User() {}

    public User(String fullName, String email, String passwordHash) {
        this.full_name = fullName;
        this.email = email;
        this.passwordHash= passwordHash;
    }

    public User( String email, String passwordHash) {
        this.email = email;
        this.passwordHash= passwordHash;
    }

}
