package com.example.pdsacw.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductId;

    @NotNull(message = "Name cannot be null")
    private String ProductName;

    private String ProductDescription;

    @Column(nullable = false)
    @NotNull(message = "Price cannot be null")
    private Double ProductPrice;

    @NotNull(message = "Selling price cannot be null")
    private Double ProductSellingPrice;

    @NotNull
    private int ProductQuantity;


    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String productDescription) {
        ProductDescription = productDescription;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(Double productPrice) {
        ProductPrice = productPrice;
    }

    public Double getProductSellingPrice() {return ProductSellingPrice;}

    public void setProductSellingPrice(Double productSellingPrice) {this.ProductSellingPrice = productSellingPrice;}

    public int getProductQuantity() {return ProductQuantity;}

    public void setProductQuantity(int productQuantity) {this.ProductQuantity = productQuantity;}
}

