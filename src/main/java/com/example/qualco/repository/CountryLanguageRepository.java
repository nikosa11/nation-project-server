package com.example.qualco.repository;

import com.example.qualco.model.Country;
import com.example.qualco.model.CountryLanguage;
import com.example.qualco.model.CountryLanguageId;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguageId> {
    List<CountryLanguage> findByCountry_CountryId(Long countryId);
}
