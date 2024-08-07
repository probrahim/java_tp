package ex_2;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    String name;
    String prenom;
    int id;
    List<Etudiant> coursSuivis;

    public  Etudiant(int id, String name, String prenom) {
        this.name = name;
        this.prenom = prenom;
        this.id = id;
        this.coursSuivis = new ArrayList<Etudiant>();
    }

}
