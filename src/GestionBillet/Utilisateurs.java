package GestionBillet;

import Gestionmdicaments.Medicaments;

import java.util.ArrayList;
import java.util.List;

public class Utilisateurs {
    private String nom;
    private String eamil;
    private int code;
    private List<Utilisateurs> utilisateurs;

    public Utilisateurs(String nom, String eamil, int code) {
        this.nom = nom;
        this.eamil = eamil;
        this.code = code;
        this.utilisateurs = new ArrayList<Utilisateurs>();
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
    public void login(Utilisateurs utilisateur){
        for(Utilisateurs u : utilisateurs){
            if ( u.eamil == utilisateur.getEamil() && u.code == utilisateur.getCode()){
                System.out.println("LOGIN SUCCESS");
            }
            else
                System.out.println("DONNER INCORECT ");
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
