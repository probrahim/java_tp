package ex_2;

import java.util.ArrayList;
import java.util.List;

public class PlateformeCours {
    List<Cours> cours;
    List<Etudiant> etudiants;

    public PlateformeCours() {
        this.cours = new ArrayList<Cours>();
        this.etudiants = new ArrayList<Etudiant>();
    }
    public Cours add_cours(Cours cours) {
        this.cours.add(cours);
        return cours;
    }
    public Etudiant add_etudiant(Etudiant etudiant) {
        this.etudiants.add(etudiant);
        return etudiant;
    }
    public List<Cours> c_ours(String name) {
        if (name != null) {
            return cours;
        }
        return new ArrayList<>();
    }
}
