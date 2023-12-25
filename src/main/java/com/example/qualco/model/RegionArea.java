package com.example.qualco.model;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "region_areas")
public class RegionArea {

    @Id
    @Column(name = "region_name", length = 100, nullable = false)
    private String regionName;

    @Column(name = "region_area", precision = 15, scale = 2, nullable = false)
    private BigDecimal regionArea;

}

