package com.example.pdsacw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bills")

public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BillId;

    private String BillDescription;

    
    private String BillDate;

    @Column(nullable = false)
    private String BillType;


}
