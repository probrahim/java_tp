package Gestionmdicaments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<StockReception> stockk;

    public Stock() {
        this.stockk = new ArrayList<>();

    }

    public void enregistrerReception(int id, Medicaments medicaments, LocalDate t, int quantie) {
        if ( quantie < 0 ) {
            quantie *=-1;
        }
        medicaments.setQuantite(medicaments.getQuantite() + quantie);
        StockReception accpter = new StockReception(id, medicaments, t, medicaments.getQuantite());
        this.stockk.add(accpter);
       // medicaments.setQuantite(medicaments.getQuantite() + quantie);

    }

    public void afficheHistorique() {
        for (StockReception recptio : stockk) {
            System.out.println(recptio);
        }
    }

    public void checkStock(int id) {
        for (StockReception recptio : stockk) {
            if (recptio.getId() != id) {
                System.out.println("Erreur : id incorrect");
            } else {
                if (recptio.getQantite() <= 5) {
                    System.out.println("!!!Alert de stock Finis : Effectuer d'une demande au fourniseur");
                }
            }
        }
    }

    public void venteStock(int valeur, int quantite) {
        for (StockReception recptio : stockk) {
            if (recptio.getId() == valeur) {
                if (recptio.getQantite() >= quantite && recptio.getQantite() > 5) {
                    recptio.setQantite(recptio.getQantite() - quantite);
                } else {
                    System.out.println("Erreur : quantite incorrect");
                }
                return;
            } else {
                System.out.println("Erreur : id incorrect");
            }
        }
    }
    public void receptionStock (int valeur,int quantite){
        for (StockReception recptio : stockk) {
            if (recptio.getId() == valeur) {
                recptio.setQantite(recptio.getQantite()+ quantite);
            }
            else
                System.out.println("Erreur : id incorrect");
        }
    }
    public void raport(){
        for (StockReception t:stockk){
            System.out.println(t);
        }
    }
}
