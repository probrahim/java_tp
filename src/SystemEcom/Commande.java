package SystemEcom;

import java.util.List;

public class Commande {
    int idCommande;
    List<Produit> produits;
    Double prixTotal;
    String client;

    public Commande(int idCommande, List<Produit> produits, Double prixTotal, String client) {
        this.idCommande = idCommande;
        this.produits = produits;
        this.prixTotal = prixTotal;
        this.client = client;
    }


    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
        prixTotal += produit.Prixl();
    }

    public void Reduction(Produit produit) {
        Double t  = (produit.Prixl() - (produit.Prixl() * 25/ 100));
    }

}
