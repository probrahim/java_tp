package SystemEcom;

public class Produit {
    int id;
    String nom;
    String description;
    Double prix;
    int Quantite;

    public Produit(int id, String nom, String description, Double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        Quantite = quantite;
    }

    public void add_product() {

        if (getId() == this.id) {
            System.out.println("Produit exist");
        }
        System.out.println("id :" + id + "\tName : " + nom + "\tdescription : " + description + "\tPrix  :"
                + prix + "\tStock de Quantite  :" + Quantite);

    }

    public int getId() {
        return id;
    }

    public void mettreAJourProduit(int id, String NewName, String NewDescription, Double NewPrix, int NewQuantite) {
        if (id == this.id) {
            this.nom = NewName;
            this.description = NewDescription;
            this.prix = NewPrix;
            Quantite = NewQuantite;
            System.out.println("Apres mise a jour  ");
            System.out.println("id :" + id + "\tName : " + nom + "\tdescription : " + description + "\tPrix  :"
                    + prix + "\tStock de Quantite  :" + Quantite);

        } else
            System.out.println("Erreur Input");


    }

    public Double Prixl() {
        return this.prix;
    }
}
