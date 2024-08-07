package ex_3;

public class Plat {
    private String name;
    private double prix;
    private String type;
    public Plat(String name, double prix, String type) {
        this.name = name;
        this.prix = prix;
        this.type = type;

    }
    public String getName() {
        return name;
    }
    public double getPrix() {
        return prix;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setType(String type) {
        this.type = type;
    }


}
