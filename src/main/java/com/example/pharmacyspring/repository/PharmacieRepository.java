package com.example.pharmacyspring.repository;

import com.example.pharmacyspring.entity.Pharmacie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {
    Pharmacie findById(int id);

}
