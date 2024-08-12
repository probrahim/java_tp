package Gestionemployes;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class Main {
    public static void main(String[] args) {
        Administrateur zsh = new Administrateur();

        Employes t =  new Employes(1,"test1","azer","@gmail.com","@gmail.com","0000");
        Employes z =  new Employes(2,"test2","azer","@gmail.com","@gmail.com","0000");
        
        zsh.addEmp(t);
        zsh.addEmp(z);
        zsh.idde(1);
        zsh.idde(2);
        Taches tt = new Taches("complete formulaire Google",1,new Date(),new Date(),"pas ");
        Taches zz = new Taches("organigramme",1,new Date(),new Date(),"pas");

        zsh.assignTache(t,tt);

        zsh.assignTache(z,zz);

        zsh.afficheTaches();
        z.updateStatus(1, Taches.STATUS_EN_COURS);
        Employes ttt =  new Employes(1,"test1","HHH","@gmail.com","@gmail.com","0000");
        zsh.updateEmp(1,ttt);
        System.out.println("------");
        zsh.idde(1);


    }
}
