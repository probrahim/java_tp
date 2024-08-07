package Gestion_Universitaire;

import java.util.ArrayList;
import java.util.List;

public class Professeur extends Personne {
    String département;
    List<String> coursenseignes;

    public Professeur(String nom, int age, int id, String département, List<String> coursenseignes) {
        super(nom, age, id);
        this.département = département;
        this.coursenseignes = coursenseignes;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Nom de prof : " + this.nom + " " + this.age + " ans, ID: " + this.id + "département " + this.département + "\ncoursenseignes" + this.coursenseignes);
    }


    public void listerCoursenseignes() {

        System.out.println("le nom de proffeseur\t :" + this.nom + "\nliste de matiere" + this.coursenseignes);

    }


}
