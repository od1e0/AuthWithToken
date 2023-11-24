package com.AuthWithToken.Auth.model;

import jakarta.persistence.*;
import lombok.Data;
@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
