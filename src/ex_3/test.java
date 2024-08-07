package ex_3;

public class test {
    public static void main(String[] args) {
        Plat ts = new Plat("pizaa",123,"plat_principale");
        Commande pl = new Commande(12,1,"plat_principale");
        Restaurant cc = new Restaurant();

        cc.ajouterplats(ts);
        cc.ajoutercommandes(pl);
        cc.check(1);
        System.out.println(cc.check(1));
    }
}
