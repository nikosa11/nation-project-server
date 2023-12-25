package com.example.qualco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.qualco.model.ResultRatioModel;

import com.example.qualco.model.Country;
import com.example.qualco.model.CountryStatModel;
import com.example.qualco.service.CountryService;
import com.example.qualco.service.CustomQueryService;


@Controller
@RequestMapping
public class CountryController {
	
    @Autowired
    private CountryService countryService;

    @Autowired
    private CustomQueryService customService;
    
    @GetMapping("/country/all")
    public ResponseEntity<List<Country>> getAllCountriesSortedByName() {
        List<Country> countries = countryService.getAllCountriesSortedByName();

        if (countries.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(countries, HttpStatus.OK);
    }
    
    @GetMapping("/country/gdp")
    public ResponseEntity<List<ResultRatioModel>> getAllGdpPerPopulation() {
        List<ResultRatioModel> resultRatioModels = customService.executeCustomQuery();

        if (resultRatioModels.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(resultRatioModels, HttpStatus.OK);
    }
    
    @GetMapping("/country/stats")
    public ResponseEntity<List<CountryStatModel>> getAllCountryStats() {
        List<CountryStatModel> countryStatModels = customService.executeCustomQueryForCountryStats();

        if (countryStatModels.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(countryStatModels, HttpStatus.OK);
    }
}