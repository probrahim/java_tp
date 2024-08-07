package Gestion_Universitaire;

import java.util.List;

public class Cours {
    int code;
    String nom_cours;
    Double credits;
    List<Cours> insci_etud;
    String professeur;

    public Cours(int code, String nom_cours, Double credits, List<Cours> insci_etud, String professeur) {
        this.code = code;
        this.nom_cours = nom_cours;
        this.credits = credits;
        this.insci_etud = insci_etud;
        this.professeur = professeur;
    }
}

