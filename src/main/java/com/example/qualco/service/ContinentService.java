
package com.example.qualco.service;

import com.example.qualco.model.Continent;
import com.example.qualco.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContinentService {

    private final ContinentRepository continentRepository;

    @Autowired
    public ContinentService(ContinentRepository continentRepository) {
        this.continentRepository = continentRepository;
    }

    public List<Continent> getAllContinents() {
        return continentRepository.findAll();
    }

    public Optional<Continent> getContinentById(Long id) {
        return continentRepository.findById(id);
    }

    public Continent saveContinent(Continent continent) {
        return continentRepository.save(continent);
    }

    public void deleteContinent(Long id) {
        continentRepository.deleteById(id);
    }
}
