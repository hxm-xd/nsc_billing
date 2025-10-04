package com.example.pdsacw.repository;

import com.example.pdsacw.entity.Service2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service2, Long> {
}
