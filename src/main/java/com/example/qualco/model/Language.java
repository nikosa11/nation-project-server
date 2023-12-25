package com.example.qualco.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id", columnDefinition = "INT(11)")
    private Long languageId;

    @Column(name = "language", length = 50, nullable = false)
    private String language;


    public Language() {
    }


    public Long getLanguage_id() {
        return languageId;
    }

    public void setLanguage_id(Long language_id) {
        this.languageId = language_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


}
