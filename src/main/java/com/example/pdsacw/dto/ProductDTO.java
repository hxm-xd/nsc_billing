package com.example.pdsacw.dto;

import jakarta.validation.constraints.NotNull;

public class ProductDTO {

    private int ProductId;

    @NotNull(message = "Product name cannot be null.")
    private String ProductName;

    private String ProductDescription;

    @NotNull(message = "Product Price cannot be null.")
    private Double ProductPrice;

    @NotNull(message = "Selling price cannot be null")
    private Double ProductSellingPrice;

    @NotNull(message = "Product quantity cannot be 0")
    private int ProductQuantity;

    public ProductDTO() {}

    public ProductDTO(int ProductId, String ProductName, String ProductDescription, Double ProductPrice,
                      Double ProductSellingPrice, int ProductQuantity) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.ProductDescription = ProductDescription;
        this.ProductPrice = ProductPrice;
        this.ProductSellingPrice = ProductSellingPrice;
        this.ProductQuantity = ProductQuantity;
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

    public Double getProductPrice() {
        return ProductPrice;
    }
    public void setProductPrice(Double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public Double getProductSellingPrice() {
        return ProductSellingPrice;
    }
    public void setProductSellingPrice(Double ProductSellingPrice) {
        this.ProductSellingPrice = ProductSellingPrice;
    }

    public int getProductQuantity() {
        return ProductQuantity;
    }
    public void setProductQuantity(int ProductQuantity) {
        this.ProductQuantity = ProductQuantity;
    }


}
