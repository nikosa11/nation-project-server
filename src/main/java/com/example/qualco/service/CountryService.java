package com.example.qualco.service;

import com.example.qualco.model.Country;
import com.example.qualco.repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries() {
        List<Country> countries = countryRepository.findAll();
        logger.info("Fetched all countries: {}", countries);
        return countries;
    }

    public Optional<Country> getCountryById(Long id) {
        Optional<Country> country = countryRepository.findById(id);
        logger.info("Fetched country by ID {}: {}", id, country.orElse(null));
        return country;
    }

    public Country saveCountry(Country country) {
        Country savedCountry = countryRepository.save(country);
        logger.info("Saved country: {}", savedCountry);
        return savedCountry;
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
        logger.info("Deleted country with ID: {}", id);
    }

    public List<Country> getAllCountriesSortedByName() {
        List<Country> countries = countryRepository.findAll();
        Collections.sort(countries, (c1, c2) -> c1.getName().compareTo(c2.getName()));
        logger.info("Fetched and sorted all countries by name");
        return countries;
    }
}
