package com.example.qualco.model;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "country_stats")
public class CountryStat {

    @EmbeddedId
    private CountryStatId id;

    @ManyToOne
    @MapsId("countryId")
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @Column(name = "year", nullable = false)
    private int year;

    @Column(name = "population")
    private int population;

    @Column(name = "gdp", precision = 15, scale = 0)
    private BigDecimal gdp;

    public CountryStat() {
    }

    public CountryStat(Country country, Region region, int year, int population, BigDecimal gdp) {
        this.id = new CountryStatId(country, region);
        this.country = country;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    // Μέθοδοι getters και setters...

    public CountryStatId getId() {
        return id;
    }

    public void setId(CountryStatId id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BigDecimal getGdp() {
        return gdp;
    }

    public void setGdp(BigDecimal gdp) {
        this.gdp = gdp;
    }
}
