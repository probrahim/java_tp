package GestionBillet;

import Gestion_courses.Eventmanage;
import Gestionmdicaments.Medicaments;

import java.util.ArrayList;
import java.util.List;

public class Utilisateurs {
    private String nom;
    private String eamil;
    private int code;
    private List<Utilisateurs> utilisateurs;
    List<Eventmanage> events;
    boolean TF = false;

    public Utilisateurs(String nom, String eamil, int code) {
        this.nom = nom;
        this.eamil = eamil;
        this.code = code;
        this.utilisateurs = new ArrayList<Utilisateurs>();
        this.TF = false;
        this.events = new ArrayList<>();
    }


    public Utilisateurs(String eamil, int code) {
        this.nom = nom;
        this.eamil = eamil;
        this.code = code;
        this.utilisateurs = utilisateurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void inscription(Utilisateurs utilisateurs){
        this.utilisateurs.add(utilisateurs);
    }
    public void affihage(){
        for(Utilisateurs u : utilisateurs){
            System.out.println("NAME :"+u.getNom()+" "+"EMAIL"+u.getEamil()+"CODE"+" "+u.getCode());
        }
    }
    public void login(Utilisateurs utilisateur) {
        boolean loggedIn = false;
        for (Utilisateurs u : utilisateurs) {
            if (u.getEamil().equals(utilisateur.getEamil()) && u.getCode() == utilisateur.getCode()) {
                System.out.println("LOGIN SUCCESS");
                loggedIn = true;
                break; // Sortir de la boucle une fois la correspondance trouvée
            }
        }
        if (!loggedIn) {
            System.out.println("DONNEES INCORRECTES");
        }
    }
    public void buy(Utilisateurs utilisateur,int place,String nameEvent) {
        for (Eventmanage em : events) {
            System.out.println(em);
        }
    }

    @Override
    public String toString() {
        return "Utilisateurs{" +
                "nom='" + nom + '\'' +
                ", eamil='" + eamil + '\'' +
                ", code=" + code +
                ", utilisateurs=" + utilisateurs +
                '}';
    }
}
