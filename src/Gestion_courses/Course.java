package Gestion_courses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
    String nom;
    int distance;
    Date date;
    List<Participant> participants = new ArrayList<Participant>();
    public Course(String nom, int distance, Date date) {
        this.nom = nom;
        this.distance = distance;
        this.date = date;
        this.participants = new ArrayList<Participant>();
    }

    @Override
    public String toString() {
        return "Course{" +
                "nom='" + nom + '\'' +
                ", distance=" + distance +
                ", date=" + date +
                ", participants=" + participants +
                '}';
    }
}
