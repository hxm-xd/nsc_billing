package com.example.pdsacw.dto;

import jakarta.validation.constraints.NotNull;

public class BillDTO {

    private int id;

    private String BillDescription;

    @NotNull(message = "Bill type cannot be null")
    private String BillType;

    @NotNull(message = "Bill date cannot be null")
    private String BillDate;

    @NotNull(message = "Amount cannot be null")
    private double BillAmount;

    public BillDTO() {}

    public BillDTO(int id, String BillDescription, String BillType, String BillDate, double BillAmount) {
        this.id = id;
        this.BillDescription = BillDescription;
        this.BillType = BillType;
        this.BillDate = BillDate;
        this.BillAmount = BillAmount;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBillDescription() {
        return BillDescription;
    }
    public void setBillDescription(String BillDescription) {
        this.BillDescription = BillDescription;
    }

    public String getBillType() {
        return BillType;
    }
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    public String getBillDate() {
        return BillDate;
    }
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    public double getBillAmount() {
        return BillAmount;
    }
    public void setBillAmount(double BillAmount) {
        this.BillAmount = BillAmount;
    }

}
