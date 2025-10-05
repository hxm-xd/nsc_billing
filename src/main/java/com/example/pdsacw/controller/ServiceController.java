package com.example.pdsacw.controller;

import com.example.pdsacw.entity.Service2;
import com.example.pdsacw.service.ServiceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {

    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping
    public Service2 addService(@Valid @RequestBody Service2 service) {
        return serviceService.saveService(service);
    }

    @GetMapping
    public List<Service2> getAllServices() {
        return serviceService.getAllServices();
    }

    @GetMapping("/{id}")
    public Service2 getService(@PathVariable long id) {
        return serviceService.getServiceById(id);
    }

    @PutMapping
    public Service2 updateService(@Valid @RequestBody Service2 service) {
        return serviceService.saveService(service);
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable long id) {
        serviceService.deleteServiceById(id);
    }
}
