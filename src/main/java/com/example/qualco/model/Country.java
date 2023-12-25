package com.example.qualco.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", columnDefinition = "INT(11)")
    private long countryId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "area", precision = 10, scale = 2)
    private double area;

    @Column(name = "national_day")
    private Date nationalDay;

    @Column(name = "country_code2", length = 2, nullable = false)
    private String countryCode2;

    @Column(name = "country_code3", length = 3, nullable = false)
    private String countryCode3;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

 

    public Country() {
    }


    public Long getCountry_id() {
        return countryId;
    }

    public void setCountry_id(Long country_id) {
        this.countryId = country_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Date getNational_day() {
        return nationalDay;
    }

    public void setNational_day(Date national_day) {
        this.nationalDay = national_day;
    }

    public String getCountry_code2() {
        return countryCode2;
    }

    public void setCountry_code2(String country_code2) {
        this.countryCode2 = country_code2;
    }

    public String getCountry_code3() {
        return countryCode3;
    }

    public void setCountry_code3(String country_code3) {
        this.countryCode3 = country_code3;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

 

}
