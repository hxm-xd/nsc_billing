package com.example.pdsacw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "services")
public class Service2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String ServiceName;

    @Column(nullable = false)
    private double servicePrice;

}
