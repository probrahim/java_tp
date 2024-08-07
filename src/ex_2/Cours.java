package ex_2;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    String titre;
    String description;
    int duree;
    List<Cours> etudiantsInscrits;

    public Cours(String titre, String description, int duree) {
        this.titre = titre;
        this.description = description;
        this.duree = duree;
        this.etudiantsInscrits = new ArrayList<Cours>();
    }

    @Override
    public String toString() {
        return "Cours{" +
                "titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", duree=" + duree +
                ", etudiantsInscrits=" + etudiantsInscrits +
                '}';
    }
}