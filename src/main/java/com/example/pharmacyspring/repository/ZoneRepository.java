package com.example.pharmacyspring.repository;

import com.example.pharmacyspring.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneRepository extends JpaRepository<Zone, Integer> {
    Zone findByNomContains(String nom);
}
