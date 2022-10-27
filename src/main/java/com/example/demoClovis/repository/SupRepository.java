package com.example.demoClovis.repository;

import com.example.demoClovis.model.Suplementos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SupRepository extends JpaRepository <Suplementos, Integer> {
}
