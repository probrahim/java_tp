package Gestionmdicaments;

import java.util.ArrayList;
import java.util.List;

public class Medicaments {
    private int id;
    private String nomMedicament;
    private String dosage;
    private Double prix;
    private int quantite;
    private List<Medicaments> ensembleMED;
    final String GREEN_UNDERLINED = "\033[4;32m";
    final String RESET = "\033[0m";  // Réinitialiser les couleurs
    final String RED = "\033[0;31m"; // Rouge
    final String GREEN = "\033[0;32m"; // Vert
    final String YELLOW = "\033[0;33m"; // Jaune
    final String BLUE = "\033[0;34m"; // Bleu
    // Constructeur avec initialisation de ensembleMED
    public Medicaments(int id,String nomMedicament, String dosage, Double prix, int quantite) {
        this.id = id;
        this.nomMedicament = nomMedicament;
        this.dosage = dosage;
        this.prix = prix;
        this.quantite = quantite;
        this.ensembleMED = new ArrayList<>();
    }
    public Medicaments() {
        this.id = id;
        this.nomMedicament = nomMedicament;
        this.dosage = dosage;
        this.prix = prix;
        this.quantite = quantite;
        this.ensembleMED = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomMedicament() {
        return nomMedicament;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public List<Medicaments> getEnsembleMED() {
        return ensembleMED;
    }

    public void setEnsembleMED(List<Medicaments> ensembleMED) {
        this.ensembleMED = ensembleMED;
    }

    public void ajouterMedicament(Medicaments medicament) {
        if ( medicament.getQuantite() < 0){
            medicament.setQuantite(medicament.getQuantite()*-1);
        }
        if (ensembleMED == null) {
            ensembleMED = new ArrayList<>();
        }
        ensembleMED.add(medicament);
    }

    public void afficheMedicament() {
        if (ensembleMED != null) {
            System.out.println(BLUE+"---Liste de Medicament---"+RESET);
            for (Medicaments medicament : ensembleMED) {
                System.out.println(medicament);
            }
        } else {
            System.out.println("Aucun médicament à afficher.");
        }
    }

    public void supprimerMedicament(Medicaments medicament) {
        if (ensembleMED != null) {
            ensembleMED.remove(medicament);
        }
    }
    public void updateMedicament(String nomMedicament,Medicaments medicament) {
        for ( Medicaments med : ensembleMED) {
            if ( med.nomMedicament == nomMedicament) {
                med.dosage = medicament.dosage;
                med.prix = medicament.prix;
                med.quantite = medicament.quantite;
            }
        }
    }

    @Override
    public String toString() {
        return "Medicaments{" +
                "nomMedicament='" + nomMedicament + '\'' +
                ", dosage='" + dosage + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }
}
