package org.example.appointment_booking_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.example.appointment_booking_system.repository")
@EntityScan(basePackages = "org.example.appointment_booking_system.model")
public class AppointmentBookingSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppointmentBookingSystemApplication.class, args);
    }
}