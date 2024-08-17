package GestionBillet;

public class TEST {
    public static void main(String[] args) {
        Utilisateurs t =  new Utilisateurs("ibrahim","ibrahim@gmail.com",3030);
        Utilisateurs v1 = new Utilisateurs("aya","aya@gmail.com",3070);
        Utilisateurs test =  new Utilisateurs("ibrahim@gmail.com",3030);

        t.inscription(t);
        v1.inscription(v1);
        t.affihage();
        v1.affihage();



        System.out.println("----ETAT DE LOGIN----");
        t.login(test);


    }
}
