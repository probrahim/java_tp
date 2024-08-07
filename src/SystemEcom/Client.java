package SystemEcom;

import java.util.List;

public class Client extends Utilisateur {
    String adresse;
    String détails;
    List<Client> historique ;

    public Client(String nom, int pass, String email, String adresse, String détails, List<Client> historique) {
        super(nom, pass, email);
        this.adresse = adresse;
        this.détails = détails;
        this.historique = historique;
    }
    public void add_cmnd(Client client) {
        historique.add(client);
    }
}
