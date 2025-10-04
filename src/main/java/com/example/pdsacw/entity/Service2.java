package com.example.pdsacw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "services")
public class Service2 {

    @Id
    private int id;

    @Column(nullable = false)
    private String ServiceName;

    @Column(nullable = false)
    private double servicePrice;

}
