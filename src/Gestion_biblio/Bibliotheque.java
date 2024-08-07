package Gestion_biblio;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    List<livre> livres;
    List<Membre> membres;

    public Bibliotheque() {
        this.livres = new ArrayList<livre>();
        this.membres = new ArrayList<Membre>();
    }

    public void add_live(livre lp){
        livres.add(lp);
    }

    public void add_membre(Membre lp){
        membres.add(lp);
    }

    public String empr(livre lp){
        if(livres.contains(lp)){
            lp.disponibilite=false;
        }
        return "livre " + lp.titre + " auteur" + lp.auteur + "\ndisponibilite :" + lp.disponibilite;
    }

    public  String rlivre(livre lp){
        if(livres.contains(lp)){
            lp.disponibilite=true;
        }
        return "livre " + lp.titre + " auteur" + lp.auteur + "\ndisponibilite :" + lp.disponibilite;
    }
}
