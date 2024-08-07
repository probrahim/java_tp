package Getsion_hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Chambre> chambres;
    List<Client> clients;

    public Hotel() {
        this.chambres = new ArrayList<Chambre>();
        this.clients = new ArrayList<Client>();
    }
    public Chambre add_chambre(Chambre chambre){
        this.chambres.add(chambre);
        return chambre;
    }
    public Client add_client(Client client){
        this.clients.add(client);
        return client;

    }

}
