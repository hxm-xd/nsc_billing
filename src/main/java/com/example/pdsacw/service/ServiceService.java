package com.example.pdsacw.service;

import com.example.pdsacw.dto.Service2DTO;
import com.example.pdsacw.entity.Service2;
import com.example.pdsacw.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Service2> getServiceById(long id) {
        return serviceRepository.findById(id);
    }

    public Service2 saveService(Service2 service) {
        return serviceRepository.save(service);
    }

    public void deleteServiceById(long id) {
        serviceRepository.deleteById(id);
    }

    public Service2DTO toDTO(Service2 service) {
        return new Service2DTO(
                service.getServiceId(),
                service.getServiceName(),
                service.getServicePrice()
        );
    }

    public Service2 toEntity(Service2DTO dto) {
        Service2 service = new Service2();

        service.setServiceId(dto.getServiceId());
        service.setServiceName(dto.getServiceName());
        service.setServicePrice(dto.getServicePrice());

        return service;
    }
}
