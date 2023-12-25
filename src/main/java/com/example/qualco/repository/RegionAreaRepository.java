package com.example.qualco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.qualco.model.RegionArea;

public interface RegionAreaRepository extends JpaRepository<RegionArea, String> {
}
