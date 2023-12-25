package com.example.qualco.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.qualco.model.Language;
import com.example.qualco.service.CountryLanguageService;
import java.util.List;

@Controller
@RequestMapping()
public class LanguageController {

    private static final Logger log = LoggerFactory.getLogger(LanguageController.class);

    @Autowired
    private CountryLanguageService countryLanguageService;

    @GetMapping("/languages/{countryId}")
    public ResponseEntity<List<Language>> getLanguagesByCountryId(@PathVariable Long countryId) {
        log.info("Request received to get languages for countryId: {}", countryId);

        List<Language> languages = countryLanguageService.getLanguagesByCountryId(countryId);
        for(Language lang: languages) {
        	log.info(lang.getLanguage());
        }

        if (languages.isEmpty()) {
            log.info("No languages found for countryId: {}", countryId);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Languages found for countryId {}: {}", countryId, languages);

        return new ResponseEntity<>(languages, HttpStatus.OK);
    }
}
