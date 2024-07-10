package com.estiam.englishapp.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Partie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Joueur joueur;

    @OneToMany(mappedBy = "partie")
    private List<Question> questions;

    public Partie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    @Override
    public String toString() {
        return "Partie{" +
                ", joueur=" + joueur +
                '}';
    }
}
