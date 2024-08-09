package Gestionemployes;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Taches  {
    public String nomT;
    public int id;
    public Date debut;
    public Date fin;

    public Taches(String nomT, int id, Date debut, Date fin) {
        this.nomT = nomT;
        this.id = id;
        this.debut = debut;
        this.fin = fin;
    }

    public String getDescription() {
        return "Tache: " + this.nomT + "\nDate: " + debut + " - " + fin;
    }
}
