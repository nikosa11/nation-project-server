package com.example.qualco.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CountryLanguageId implements Serializable {

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "language_id")
    private Long languageId;

    public CountryLanguageId() {
    }

    public CountryLanguageId(Long countryId, Long languageId) {
        this.countryId = countryId;
        this.languageId = languageId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return Objects.equals(countryId, that.countryId) &&
                Objects.equals(languageId, that.languageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, languageId);
    }
}
