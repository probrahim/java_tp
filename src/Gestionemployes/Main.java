package Gestionemployes;

import SystemEcom.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class Main {
    public static void main(String[] args) {
        Administrateur admin = new Administrateur();

        Employes emp1 = new Employes(1, "Ali", "Ahmed", "123 Street", "ali@example.com", "123456789");
        Employes emp2 = new Employes(2, "Sara", "Mohammed", "456 Avenue", "sara@example.com", "987654321");
        Employes tes1 = new Employes(3,"hiba","hiba","casa-fes","hiba@gmail.com","666");
        admin.addEmp(emp1);
        admin.addEmp(emp2);
        admin.addEmp(tes1);

        Taches task1 = new Taches("Complete formulaire", 101, new Date(), new Date());
        Taches task2 = new Taches("Complete data", 102, new Date(), new Date());
        Taches task3 = new Taches("Complete data", 103, new Date(), new Date());

        admin.assignTache(emp1, task1);
        admin.assignTache(emp2, task2);
        admin.assignTache(tes1, task3);

        admin.getEmp();

        admin.afficheTaches();

        Employes updatedEmp1 = new Employes(1, "Ali", "Hassan", "789 Road", "ali_new@example.com", "111222333");
        admin.updateEmp(1, updatedEmp1);
        admin.getEmp();

    }
}
