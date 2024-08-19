package GestionBillet;

import Gestion_courses.Eventmanage;

import java.util.Date;

public class TEST {
    public static void main(String[] args) {
        Utilisateurs t =  new Utilisateurs("ibrahim","ibrahim@gmail.com",3030);
        Utilisateurs v1 = new Utilisateurs("aya","aya@gmail.com",3070);
        Utilisateurs test =  new Utilisateurs("ibrahim@gmail.com",3030);
        Utilisateurs pl  = new Utilisateurs("a","l",3);
        Utilisateurs pq  =  new Utilisateurs("l",3);


        t.inscription(t);
        v1.inscription(v1);
        t.affihage();
        v1.affihage();

        System.out.println("--CHECK RESERVATION");

        System.out.println("----ETAT DE LOGIN----");
        t.login(test);


        System.out.println("----EVENT----");

        Date cela = new Date();
        Event event1 =  new Event("boite","casa",cela,5);
        Event event2 =  new Event("test","casa-zenitch",cela,10);
        Event event11 = new Event("cc","casa-casa",cela,100);
        System.out.println("---ADD PLACE---");

        Eventmanage  px= new Eventmanage();
        px.ajouterEvente(event1);
        px.ajouterEvente(event2);
        px.updateEvent("boite",event11);

        System.out.println("------");
        pl.buy(pl,3,"boite");



        System.out.println("------");

        px.affichee();

        px.addbillet("boite",50);
       // px.updateEvent("boite",event11);
        System.out.println("---- APRES EVENT----");
        px.affichee();

    }
}
