package Gestion_courses;

import java.util.ArrayList;
import java.util.List;

public class GestionCourses {
    List<Course> course;

    public GestionCourses() {
        this.course =new ArrayList<Course>();
    }

    public  String course_add(Course course) {
        this.course.add(course);
        return "name :"+ course.nom + " ";
    }
    public void inscription_add(Course course, Participant participant) {
        if(this.course.contains(course))
            // this.course.get(this.course.indexOf(course)).participants.add(participant);
            System.out.println(this.course.get(this.course.indexOf(course)).participants.add(participant));
        else
            System.out.println("deja dans cela ");
    }
    public String affiche(Course course) {
        int index = this.course.indexOf(course);
        if (index != -1) {
            List<Participant> participants = this.course.get(index).participants;
            return participants.toString();
        } else {
            return "Course not found";
        }
    }
}
