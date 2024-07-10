package com.estiam.englishapp.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 100)
    private String nom;
    private String cp;

    @OneToMany(mappedBy = "ville")
    private List<Joueur> joueurs;

    public Ville() {
    }

    public Ville(String nom, String cp) {
        this.nom = nom;
        this.cp = cp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
