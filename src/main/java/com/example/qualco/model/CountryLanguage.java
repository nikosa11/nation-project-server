package com.example.qualco.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "country_languages")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne
    @MapsId("countryId")
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @MapsId("languageId")
    @JoinColumn(name = "language_id")
    private Language language;

    @Column(name = "official")
    private boolean official;

    public CountryLanguage() {
        this.id = new CountryLanguageId();
    }

    public CountryLanguage(Country country, Language language, boolean official) {
        this.id = new CountryLanguageId(country.getCountry_id(), language.getLanguage_id());
        this.country = country;
        this.language = language;
        this.official = official;
    }

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }
}
