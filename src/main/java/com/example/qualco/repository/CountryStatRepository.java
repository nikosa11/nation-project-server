package com.example.qualco.repository;

import com.example.qualco.model.CountryStat;
import com.example.qualco.model.CountryStatId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryStatRepository extends JpaRepository<CountryStat, CountryStatId> {
}
