package com.example.pdsacw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "services")
public class Service2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ServiceId;

    @Column(nullable = false)
    private String ServiceName;

    @Column(nullable = false)
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
