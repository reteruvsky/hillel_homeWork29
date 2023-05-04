package com.example.homework29.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Role role;

    public enum Role {
        ROLE_ADMIN, ROLE_USER, ROLE_ANONYMOUS
    }
}
