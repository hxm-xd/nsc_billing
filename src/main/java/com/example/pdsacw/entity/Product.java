package com.example.pdsacw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;

    private String ProductName;

    private String ProductDescription;

    @Column(nullable = false)
    private int ProductPrice;

}

