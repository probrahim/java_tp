package SystemEcom;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Utilisateur {
     String niveau;
     List<Admin> isteProduct;

    public Admin(String nom, int pass, String email, String adminName,List<Admin> isteProduct ) {
        super(nom, pass, email);
        this.niveau = niveau;
        this.isteProduct = new ArrayList<>();
    }
    public void add_product(Admin admin) {
        this.isteProduct.add(admin);
    }
}
