package Gestion_biblio;

public class test {
    public static void main(String[] args) {
        livre vivo = new livre("c++","dev",12233333,true);
        Membre asus = new Membre("ibhassan","boly",12);
       Bibliotheque test = new Bibliotheque();
test.add_live(vivo);
       test.add_membre(asus);
        test.empr(vivo);
      System.out.println(test.empr(vivo));
    //System.out.println(test.rlivre(vivo));
    }
}
