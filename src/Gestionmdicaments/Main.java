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
        Medicaments z =  new Medicaments(1,"paracetamol","20mg",500.45,100);
        // duplica mise a jour
       // Medicaments zUpdate =  new Medicaments(1,"paracetamol","10mg",300.45,20);
        Medicaments up =  new Medicaments(2,"paracetamol","40mg",300.45,20);
    //    Medicaments p =  new Medicaments(3,"amoxil","50mg",250.45,100);

        Medicaments y =  new Medicaments(4,"doli","30mg",350.5,30);
        Medicaments x =  new Medicaments();

        x.ajouterMedicament(z);
//        x.updateMedicament("paracetamol",zUpdate);
    //    x.ajouterMedicament(p);
        x.afficheMedicament();
        x.updateMedicament("paracetamol",y);
        // faire supprimer un medicament dans notre systeme:
        //x.supprimerMedicament();
        x.afficheMedicament();


        Stock ps = new Stock();
        ps.enregistrerReception(1,z,LocalDate.now(),2);
        ps.enregistrerReception(1,z,LocalDate.now(),30);
        ps.checkStock(1);
        ps.venteStock(1,30);
        ps.venteStock(1,30);
        ps.afficheHistorique();


        System.out.println("-----/////----");
        ps.stockanow(z);


        // afficher la lsit des medicament
//        x.afficheMedicament();
//
//        // supprimer un medicament;
//        System.out.println(BLUE+"---GESTION DE STOCK---"+RESET);
//
//        Stock gs =  new Stock();
//
//        gs.enregistrerReception(1,z,LocalDate.now(),10);
//        //gs.enregistrerReception(2,z,LocalDate.now(),25);
//
//        gs.afficheHistorique();
//        System.out.println(YELLOW+"--- SYSTEM : ALERT MESSAGE---"+RED);
//        gs.checkStock(1);
//        System.out.println(" "+RESET );
//        gs.venteStock(1,10);
//        gs.afficheHistorique();
//        gs.receptionStock(1,30);
//        gs.receptionStock(2,70);
//        gs.afficheHistorique();
//        System.out.println(YELLOW+"---TOTAL---"+RESET);

    }
}
