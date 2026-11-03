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

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
