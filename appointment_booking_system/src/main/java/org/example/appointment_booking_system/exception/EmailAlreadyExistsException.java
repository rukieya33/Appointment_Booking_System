package org.example.appointment_booking_system.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String email) {
        super("An account with " + email + " already exists");
    }
}
