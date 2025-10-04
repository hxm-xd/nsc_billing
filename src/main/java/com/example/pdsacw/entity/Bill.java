package com.example.pdsacw.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bills")

public class Bill {

    @Id
    private int BillId;

    private String BillDescription;

    @Column(nullable = false)
    private String BillDate;

    @Column(nullable = false)
    private String BillType;


}
