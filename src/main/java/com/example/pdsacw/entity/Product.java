package com.example.pdsacw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    private int ProductId;

    private String ProductName;

    private String ProductDescription;

    @Column(nullable = false)
    private int ProductPrice;

}

