package com.estiam.englishapp.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Verbe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "baseVerbale", length = 100)
    private String baseVerbale;
    private String preterit;
    private String participePasse;
    private String traduction;

    @OneToMany(mappedBy = "verbe")
    private List<Question> questions;

    public Verbe() {}

    public Verbe(String baseVerbale, String preterit, String participePasse, String traduction) {
        this.baseVerbale = baseVerbale;
        this.preterit = preterit;
        this.participePasse = participePasse;
        this.traduction = traduction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBaseVerbale() {
        return baseVerbale;
    }

    public void setBaseVerbale(String baseVerbale) {
        this.baseVerbale = baseVerbale;
    }

    public String getPreterit() {
        return preterit;
    }

    public void setPreterit(String preterit) {
        this.preterit = preterit;
    }

    public String getParticipePasse() {
        return participePasse;
    }

    public void setParticipePasse(String participePasse) {
        this.participePasse = participePasse;
    }

    public String getTraduction() {
        return traduction;
    }

    public void setTraduction(String traduction) {
        this.traduction = traduction;
    }
}
