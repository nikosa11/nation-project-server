package com.example.qualco.model;

public class CountryStatModel {

    private String countryName;
    private String regionName;
    private String continentName;
    private int year;
    private double population;
    private double gdp;


    // Constructors
    public CountryStatModel() {
    }

    public CountryStatModel(String countryName, String regionName, String continentName, int year, double population, double gdp) {
        this.countryName = countryName;
        this.regionName = regionName;
        this.continentName = continentName;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}
