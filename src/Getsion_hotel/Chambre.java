package Getsion_hotel;

public class Chambre {
    int numero; // numero de chambre
    String type; // simple,double,suite
    int prix; // prix par nuit

    boolean disponibilite = true; // la chambre etat diponbile ou pas par defult oui

    public Chambre(int numero, String type, int prix, boolean disponibilite) {
        this.numero = numero;
        this.type = type;
        this.prix = prix;
        this.disponibilite = disponibilite;
    }
}
