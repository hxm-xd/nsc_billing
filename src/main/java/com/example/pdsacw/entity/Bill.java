package com.example.pdsacw.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "bills")

public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BillId;

    private String BillDescription;

    @NotNull(message = "Date cannot be null")
    private String BillDate;

    @Column(nullable = false)
    @NotNull(message = " Bill type cannot be null")
    private String BillType;

    @NotNull
    private Double BillAmount;


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

    public Double getBillAmount() {
        return BillAmount;
    }

    public void setBillAmount(Double billAmount) {
        BillAmount = billAmount;
    }

}
