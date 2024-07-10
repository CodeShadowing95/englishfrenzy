package com.estiam.englishapp.pojos;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reponsePreterit", length = 100)
    private String reponsePreterit;
    private String reponseParticipePasse;
    private Timestamp dateEnvoi;
    private Timestamp dateReponse;

    @ManyToOne
    private Partie partie;

    @ManyToOne
    private Verbe verbe;

    public Question() {
    }

    public Question(String reponsePreterit, String reponseParticipePasse, Timestamp dateEnvoi, Timestamp dateReponse) {
        this.reponsePreterit = reponsePreterit;
        this.reponseParticipePasse = reponseParticipePasse;
        this.dateEnvoi = dateEnvoi;
        this.dateReponse = dateReponse;
    }

    public String getReponsePreterit() {
        return reponsePreterit;
    }

    public void setReponsePreterit(String reponsePreterit) {
        this.reponsePreterit = reponsePreterit;
    }

    public String getReponseParticipePasse() {
        return reponseParticipePasse;
    }

    public void setReponseParticipePasse(String reponseParticipePasse) {
        this.reponseParticipePasse = reponseParticipePasse;
    }

    public Timestamp getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Timestamp dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Timestamp getDateReponse() {
        return dateReponse;
    }

    public void setDateReponse(Timestamp dateReponse) {
        this.dateReponse = dateReponse;
    }

    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public Verbe getVerbe() {
        return verbe;
    }

    public void setVerbe(Verbe verbe) {
        this.verbe = verbe;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id + 
                ", reponsePreterit='" + reponsePreterit + '\'' +
                ", reponseParticipePasse='" + reponseParticipePasse + '\'' +
                ", dateEnvoi=" + dateEnvoi +
                ", dateReponse=" + dateReponse +
                ", partie=" + partie +
                ", verbe=" + verbe +
                '}';
    }
}
