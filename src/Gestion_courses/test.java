package Gestion_courses;

import java.sql.Date;

public class test {
    public static void main(String[] args) {
        Date p = new Date(2024,8,2);
        Course s = new Course("ibrahim",12,p);
        Participant t  = new Participant("ibrahim","hiba",12,1);
        GestionCourses xc = new GestionCourses();
        xc.course_add(s);
        xc.inscription_add(s,t);


    }
}