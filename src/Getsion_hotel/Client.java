package Getsion_hotel;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    String prenom;
    int id;
    List<Client> chambresReservees;

    public Client(String name, String prenom, int id, List<Client> chambresReservees) {
        this.name = name;
        this.prenom = prenom;
        this.id = id;
        this.chambresReservees = new ArrayList<Client>();
    }
}
