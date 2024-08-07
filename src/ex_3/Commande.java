package ex_3;

public class Commande {
    int numeroCommande;
    int table;
    String plats;

    public Commande(int numeroCommande, int table, String plats) {
        this.numeroCommande = numeroCommande;
        this.table = table;
        this.plats = plats;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "numeroCommande=" + numeroCommande +
                ", table=" + table +
                ", plats='" + plats + '\'' +
                '}';
    }
}
