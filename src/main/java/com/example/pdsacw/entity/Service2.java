package com.example.pdsacw.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "services")
public class Service2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ServiceId;

    @Column(nullable = false)
    @NotNull(message = "Name cannot be null")
    private String ServiceName;


    @Column(nullable = false)
    @NotNull(message = "Price cannot be null")
    private double servicePrice;


    public int getServiceId() {
        return ServiceId;
    }

    public void setServiceId(int serviceId) {
        ServiceId = serviceId;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }
}
