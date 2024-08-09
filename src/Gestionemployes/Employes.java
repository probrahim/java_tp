package Gestionemployes;

import java.util.ArrayList;
import java.util.List;

public class Employes {
    public int id;
    public String nom;
    public String prenom;
    public String adresse;
    public String email;
    public String telephone;
    public List<Taches> tachesAttribuees;

    public Employes(int id, String nom, String prenom, String adresse, String email, String telephone) {
        this.id = id;
        this.nom = nom.toUpperCase();
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.tachesAttribuees = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Employes{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
