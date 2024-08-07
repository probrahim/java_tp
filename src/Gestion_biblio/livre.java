package Gestion_biblio;

public class livre {
    String titre;
    String auteur;
    int ISBN;
    Boolean disponibilite = true;

    public  livre(String titre,String auteur, int ISBN, Boolean disponibilite) {
        this.titre = titre;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.disponibilite = disponibilite;

    }

}
