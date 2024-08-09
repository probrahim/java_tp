package Gestionemployes;

import java.util.ArrayList;
import java.util.List;

public class Administrateur {
    public List<Employes> Emp;

    public Administrateur() {
        this.Emp = new ArrayList<>();
    }

    public void addEmp(Employes emp) {
        this.Emp.add(emp);
    }

    public void getEmp() {
        for (Employes emp : this.Emp) {
            System.out.println(emp);
        }
    }

    public void updateEmp(int id, Employes newEmp) {
        for (Employes emp : this.Emp) {
            if (emp.id == id) {
                emp.nom = newEmp.nom.toUpperCase();
                emp.prenom = newEmp.prenom;
                emp.adresse = newEmp.adresse;
                emp.telephone = newEmp.telephone;
                emp.email = newEmp.email;
            }
        }
    }

    public void assignTache(Employes emp, Taches t) {
        for (Employes emp1 : this.Emp) {
            if (emp1.id == emp.id) {
                emp1.tachesAttribuees.add(t);
            }
        }
    }

    public void afficheTaches() {
        for (Employes emp : this.Emp) {
            System.out.println("Employee: " + emp.nom + " " + emp.prenom);
            for (Taches t : emp.tachesAttribuees) {
                System.out.println(t.getDescription());
            }
        }
    }
}

