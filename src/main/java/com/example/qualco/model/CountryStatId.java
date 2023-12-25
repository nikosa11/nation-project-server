package com.example.qualco.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class CountryStatId implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    private Country country;

    @ManyToOne
    private Region region;

    public CountryStatId() {
    }

    public CountryStatId(Country country, Region region) {
        this.country = country;
        this.region = region;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryStatId that = (CountryStatId) o;
        return Objects.equals(country, that.country) &&
               Objects.equals(region, that.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, region);
    }
}