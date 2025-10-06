package com.example.pdsacw.dto;

import jakarta.validation.constraints.NotNull;

public class ProductDTO {

    private int ProductId;

    @NotNull(message = "Product name cannot be null.")
    private String ProductName;

    private String ProductDescription;

    @NotNull(message = "Product Price cannot be null.")
    private int ProductPrice;

    public ProductDTO() {}

    public ProductDTO(int ProductId, String ProductName, String ProductDescription, int ProductPrice) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.ProductDescription = ProductDescription;
        this.ProductPrice = ProductPrice;
    }

    public int getProductId() {
        return ProductId;
    }
    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public int getProductPrice() {
        return ProductPrice;
    }
    public void setProductPrice(int ProductPrice) {
        this.ProductPrice = ProductPrice;
    }


}
