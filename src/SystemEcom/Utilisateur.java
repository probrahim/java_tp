package SystemEcom;

public class Utilisateur {
    String nom;
    int pass;
    String email;

    public Utilisateur(String nom, int pass, String email) {
        this.nom = nom;
        this.pass = pass;
        this.email = email;
    }

    public void connextion(){
        System.out.println("Connected to system\t" + this.nom);
    }
    public void deonnexion() {
        System.out.println("Disconnected from system\t" + this.nom);
    }
}
