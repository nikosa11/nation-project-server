// CountryLanguageService.java

package com.example.qualco.service;

import com.example.qualco.model.CountryLanguage;
import com.example.qualco.model.CountryLanguageId;
import com.example.qualco.model.Language;
import com.example.qualco.repository.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CountryLanguageService {

    private final CountryLanguageRepository countryLanguageRepository;
    
  

    @Autowired
    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }
    
    @Autowired
    private  CountryService countryService;
    
    public List<CountryLanguage> getAllCountryLanguages() {
        return countryLanguageRepository.findAll();
    }

    public Optional<CountryLanguage> getCountryLanguageById(Long countryId, Long languageId) {
        return countryLanguageRepository.findById(new CountryLanguageId(countryId, languageId));
    }

    public CountryLanguage saveCountryLanguage(CountryLanguage countryLanguage) {
 
        return countryLanguageRepository.save(countryLanguage);
    }

    public void deleteCountryLanguage(Long countryId, Long languageId) {
        countryLanguageRepository.deleteById(new CountryLanguageId(countryId, languageId));
    }
    
  
    
    public List<Language> getLanguagesByCountryId(Long countryId) {
        return countryLanguageRepository.findByCountry_CountryId(countryId).stream()
                .map(CountryLanguage::getLanguage)
                .collect(Collectors.toList());
    }
}
