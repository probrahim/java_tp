package Gestionemployes;

import jdk.jshell.Snippet;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Taches  {

    public static final String STATUS_TERMINEE = "terminée";
    public static final String STATUS_EN_COURS = "en cours";
    public static final String STATUS_EN_DIFFICULTE = "en difficulté";


    public String nomT;
    public int id;
    public Date debut;
    public Date fin;
    private String status;


    public Taches(String nomT, int id, Date debut, Date fin,String status) {
        this.nomT = nomT;
        this.id = id;
        this.debut = debut;
        this.fin = fin;
        this.status = status;
    }

    public String getDescription() {
        return "Tache: " + this.nomT + "\nDate: " + debut + " - " + fin;
    }

    public void setStatus(String status) {
        if (status.equals(STATUS_TERMINEE) || status.equals(STATUS_EN_COURS) || status.equals(STATUS_EN_DIFFICULTE)) {
            this.status = status;
        } else {
            System.out.println("Status invalide. Choisissez parmi: terminée, en cours, en difficulté.");
        }
    }

    public String getStatus() {
        return this.status;
    }
}
