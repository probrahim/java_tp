package Gestion_biblio;

public class Membre {
    String nom;
    String prenom;
    int identifiant;
    int[]  livresEmpruntes = new int[0];
    //int[] tableau = new int[0];

    public Membre(String nom, String prenom, int identifiant) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.livresEmpruntes = new int[0];

    }
}
