package Gestion_Universitaire;

public abstract  class Personne {
    String nom;
    int age;
    int id;

    public Personne(String nom, int age, int id) {
        this.nom = nom;
        this.age = age;
        this.id = id;
    }
    public abstract void afficherInfo();
//    public Personne afficherInfo_12(){
//        return new Personne(nom, age, id);
//    }


// moyenne generale





    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
