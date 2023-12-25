
package com.example.qualco.service;

import com.example.qualco.model.RegionArea;
import com.example.qualco.repository.RegionAreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionAreaService {

    private final RegionAreaRepository regionAreaRepository;

    @Autowired
    public RegionAreaService(RegionAreaRepository regionAreaRepository) {
        this.regionAreaRepository = regionAreaRepository;
    }

    public List<RegionArea> getAllRegionAreas() {
        return regionAreaRepository.findAll();
    }

    public Optional<RegionArea> getRegionAreaByName(String regionName) {
        return regionAreaRepository.findById(regionName);
    }

    public RegionArea saveRegionArea(RegionArea regionArea) {
        return regionAreaRepository.save(regionArea);
    }

    public void deleteRegionArea(String regionName) {
        regionAreaRepository.deleteById(regionName);
    }
}
