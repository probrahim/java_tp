package ex_3;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<Commande> commandes;
    List<Plat> plats;

    public Restaurant() {
        this.commandes = new ArrayList<Commande>();
        this.plats = new ArrayList<Plat>();
    }

    public String ajouterplats(Plat plats) {
        this.plats.add(plats);
        return plats.toString();
    }

    public String ajoutercommandes(Commande commande) {
        this.commandes.add(commande);
        return commande.toString();
    }

    public Commande check(int pl) {
        for (Commande c : commandes) {
            if (c.table == pl) {
                return c;
            }
        }
        return null;
    }
}