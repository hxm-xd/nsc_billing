package com.example.pdsacw.entity;

import jakarta.persistence.*;
import jdk.jfr.Description;

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


    public int getBillId() {
        return BillId;
    }

    public void setBillId(int billId) {
        BillId = billId;
    }

    public String getBillDescription() {
        return BillDescription;
    }

    public void setBillDescription(String billDescription) {
        BillDescription = billDescription;
    }

    public String getBillDate() {
        return BillDate;
    }

    public void setBillDate(String billDate) {
        BillDate = billDate;
    }

    public String getBillType() {
        return BillType;
    }

    public void setBillType(String billType) {
        BillType = billType;
    }
}
