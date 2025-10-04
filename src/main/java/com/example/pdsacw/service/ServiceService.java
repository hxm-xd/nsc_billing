package com.example.pdsacw.service;

import com.example.pdsacw.entity.Service2;
import com.example.pdsacw.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public Service2 createService(Service2 service) {
        return serviceRepository.save(service);
    }

    public List<Service2> getAllServices() {
        return serviceRepository.findAll();
    }

    public Service2 getServiceById(long id) {
        return serviceRepository.getReferenceById(id);
    }

    public Service2 saveService(Service2 service) {
        return serviceRepository.save(service);
    }

    public void deleteServiceById(long id) {
        serviceRepository.deleteById(id);
    }
}
