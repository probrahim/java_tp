package Gestionmdicaments;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        final String GREEN_UNDERLINED = "\033[4;32m";
        final String RESET = "\033[0m";  // Réinitialiser les couleurs
        final String RED = "\033[0;31m"; // Rouge
        final String GREEN = "\033[0;32m"; // Vert
        final String YELLOW = "\033[0;33m"; // Jaune
        final String BLUE = "\033[0;34m"; // Bleu
        Medicaments z =  new Medicaments(1,"paracetamol","20mg",500.45,0);
        Medicaments up =  new Medicaments(2,"paracetamol","40mg",300.45,20);
        Medicaments p =  new Medicaments(3,"amoxil","50mg",250.45,100);
        Medicaments x =  new Medicaments();
        x.ajouterMedicament(z);
        x.ajouterMedicament(p);

        // afficher la lsit des medicament
        x.afficheMedicament();

        // supprimer un medicament;
        System.out.println(BLUE+"---GESTION DE STOCK---"+RESET);

        Stock gs =  new Stock();

        gs.enregistrerReception(1,z,LocalDate.now(),10);
        //gs.enregistrerReception(2,z,LocalDate.now(),25);

        gs.afficheHistorique();
        System.out.println(YELLOW+"--- SYSTEM : ALERT MESSAGE---"+RED);
        gs.checkStock(1);
        System.out.println(" "+RESET );
        gs.venteStock(1,10);
        gs.afficheHistorique();
        gs.receptionStock(1,30);
        gs.afficheHistorique();
        System.out.println(YELLOW+"---TOTAL---"+RESET);
        gs.raport();

    }
}
