package com.example.pdsacw.dto;

import jakarta.validation.constraints.NotNull;

public class Service2DTO {

    private int ServiceId;

    @NotNull(message = "Service name cannot be null")
    private String serviceName;

    @NotNull(message = "Service price cannot be null")
    private Double ServicePrice;

    public Service2DTO() {}

    public Service2DTO(int ServiceId, String serviceName, Double ServicePrice) {
        this.ServiceId = ServiceId;
        this.serviceName = serviceName;
        this.ServicePrice = ServicePrice;
    }

    public int getServiceId() {
        return ServiceId;
    }
    public void setServiceId(int serviceId) {
        ServiceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getServicePrice() {
        return ServicePrice;
    }
    public void setServicePrice(Double servicePrice) {
        ServicePrice = servicePrice;
    }

}
