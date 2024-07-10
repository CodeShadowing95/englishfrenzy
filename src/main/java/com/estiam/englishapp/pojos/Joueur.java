package com.estiam.englishapp.pojos;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 100)
    private String nom;
    @Column(name = "email", length = 200, unique = true)
    private String email;
    private String prenom;
    private String motDePasse;
    private String niveau;

    @ManyToOne
    private Ville ville;

    @OneToMany(mappedBy = "joueur")
    private List<Partie> parties;

    public Joueur() {
    }

    public Joueur(String nom, String email, String prenom, String motDePasse, String niveau) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.niveau = niveau;
    }

    // Getters and setters

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                ", prenom='" + prenom + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", niveau='" + niveau + '\'' +
                ", ville=" + ville +
                '}';
    }
}
