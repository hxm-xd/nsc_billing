package com.example.pdsacw.controller;

import com.example.pdsacw.dto.Service2DTO;
import com.example.pdsacw.entity.Service2;
import com.example.pdsacw.repository.ProductRepository;
import com.example.pdsacw.repository.ServiceRepository;
import com.example.pdsacw.service.ProductService;
import com.example.pdsacw.service.ServiceService;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {

    private final ServiceService serviceService;
    private final ServiceRepository serviceRepository;


    public ServiceController(ServiceService serviceService, ProductRepository productRepository, ProductService productService1, ServiceRepository serviceRepository) {
        this.serviceService = serviceService;
        this.serviceRepository = serviceRepository;
    }

    @PostMapping
    public Service2DTO addService(@Valid @RequestBody Service2DTO dto) {
        Service2 service = serviceService.toEntity(dto);
        Service2 saved = serviceRepository.save(service);

        return serviceService.toDTO(saved);
    }

    @GetMapping
    public List<Service2DTO> getAllServices() {
        return serviceRepository.findAll()
                .stream()
                .map(serviceService::toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public Service2DTO getService(@PathVariable long id) {
        Service2 service = serviceService.getServiceById(id)
                .orElseThrow(() -> new RuntimeException("No such Service"));

        return serviceService.toDTO(service);
    }

    @PutMapping
    public Service2DTO updateService(@Valid @RequestBody Service2DTO dto) {
        Service2 service = serviceService.toEntity(dto);
        Service2 saved = serviceRepository.save(service);

        return serviceService.toDTO(saved);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable long id) {
        serviceService.deleteServiceById(id);
    }
}
