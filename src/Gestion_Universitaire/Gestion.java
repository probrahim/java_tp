package Gestion_Universitaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gestion {
    public static void main(String[] args) {
        // Exemple d'utilisation
        List<Double> notes = new ArrayList<>();
        notes.add(12.0);
        notes.add(15.0);
        notes.add(14.5);

        int[] v = {};

        List<String> ts = new ArrayList<>();
        ts.add("math_1");
        ts.add("math_2");
        ts.add("math_3");


        Etudiant etudiant = new Etudiant("Alice", 20, 12345, "Informatique", 3, notes);
        Professeur pr = new Professeur("mohamed", 12, 1, "informatique", ts);
        etudiant.afficherInfo();
        pr.afficherInfo();
        pr.listerCoursenseignes();
        System.out.println("-----------------------");
        System.out.println("Moyenne des notes: " + etudiant.calculMoyenne());
        System.out.println("total des cours pour le prof :");
        etudiant.afficheNot();
    }
}
