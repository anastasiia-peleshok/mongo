package com.mongo.mongo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
@Entity
@RequiredArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    @Column(name = "registration_number")
    private String registrationNumber;
    private String address;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            createdAt =  new Timestamp(System.currentTimeMillis());
        }
    }
}
