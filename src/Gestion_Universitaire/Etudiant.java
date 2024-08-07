package Gestion_Universitaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant extends Personne {
    String specialite;
    int annees;
    List<Etudiant> etudiants;
    List<Double> liste_notes;

    public Etudiant(String nom, int age, int id, String specialite, int annees, List<Double> liste_notes) {
        super(nom, age, id);
        this.specialite = specialite;
        this.annees = annees;
        this.etudiants = new ArrayList<Etudiant>();
        this.liste_notes = liste_notes;
    }

    public void afficherInfo() {
        System.out.println("Etudiant: " + this.nom + " " + this.age + " ans, ID: " + this.id + ", Spécialité: " + this.specialite + ", Années: " + this.annees);
    }

    public void afficheNot(){

        System.out.println("le nom d'etudiant \t:"+this.nom +"les ensembles des notes \f"+this.liste_notes);
    }

    public Double calculMoyenne() {
        if (this.liste_notes.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;

        for (Double note : this.liste_notes) {
            sum += note;
        }

        return sum / this.liste_notes.size();
    }

    public String getSpecialite() {
        return specialite;
    }
    //// moyenne gene
}
