package ex_2;

public class test_1 {
    public static void main(String[] args) {
        Etudiant p = new Etudiant(23,"hiba","ibrahim");
        Cours t = new Cours("math_inf","base de material",34);
        //System.out.println(p);
        PlateformeCours v = new PlateformeCours();

        v.add_etudiant(p);
        v.add_cours(t);
        v.c_ours("hiba");
        System.out.println(v.add_etudiant(p));
        System.out.println(v.add_cours(t));
        System.out.println(v.c_ours("hiba"));
    }
}
