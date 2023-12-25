package com.example.qualco.model;

public class ResultRatioModel {
	 private String name;
	 private String countryCode3;
     private int year;
     private double population;
     private double gdp;
     
     

     public ResultRatioModel() {
     }

     public ResultRatioModel(String name, String countryCode3, int year, double population, double gdp) {
         this.setName(name);
         this.setCountryCode3(countryCode3);
         this.setYear(year);
         this.setPopulation(population);
         this.setGdp(gdp);
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode3() {
		return countryCode3;
	}

	public void setCountryCode3(String countryCode3) {
		this.countryCode3 = countryCode3;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getGdp() {
		return gdp;
	}

	public void setGdp(double gdp) {
		this.gdp = gdp;
	}


}
