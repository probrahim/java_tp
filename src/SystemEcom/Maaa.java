package SystemEcom;

public class Maaa {
    public static void main(String[] args) {
        Utilisateur t  = new Utilisateur("admin",12,"hassani@gmail.com");
        t.connextion();
        Produit v = new Produit(1,"pp","vvv",12.5,30);
        Produit x = new Produit(1,"pp","vvv",12.5,30);
        v.add_product();
        v.mettreAJourProduit(1,"ss","mm",1000.0,45);

    }
}
