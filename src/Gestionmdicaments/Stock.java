package Gestionmdicaments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void stockanow(Medicaments medicaments) {
        // Créer un dictionnaire pour stocker les quantités actuelles par nom de médicament
        Map<String, Integer> stockMap = new HashMap<>();

        // Parcourir les enregistrements du stock et accumuler les quantités pour le médicament spécifié
        for (StockReception recptio : stockk) {
            String medicament = recptio.getMedicament().getNomMedicament();
            if (medicament.equals(medicaments)) {
                int quantite = recptio.getQantite();
                stockMap.put(medicament, stockMap.getOrDefault(medicament, 0) + quantite);
            }
        }

        // Afficher le rapport pour le médicament spécifié
        System.out.println("--- Rapport de Stock pour " + medicaments + " ---");
            for (Map.Entry<String, Integer> entry : stockMap.entrySet()) {
                System.out.println("Médicament: " + entry.getKey() + ", Quantité en stock: " + entry.getValue());
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
