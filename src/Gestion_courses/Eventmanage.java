package Gestion_courses;

import GestionBillet.Event;

import java.util.ArrayList;
import java.util.List;

public class Eventmanage {
    List<Event> events;
    boolean test = true;

    public Eventmanage() {
        this.events = new ArrayList<>();
        this.test= true;
    }


    public void ajouterEvente(Event event) {
                this.events.add(event);
    }


    public void nombreB(Event event){
        for(Event e:events){
            if(e.equals(event)){
            }
        }
    }
    public void addbillet(String name,int place){
        for(Event e:events){
            if(e.getName() == name){
                e.setPlace(e.getPlace()+place);
            }
        }
    }
    public void supprimerEvent(Event event) {
        this.events.remove(event);
    }
    public void affichee (){
        for (Event e : this.events) {
            System.out.println(e);
        }
    }
    public void updateEvent (String name,Event event){
        for (Event e : this.events) {
            if(e.getName().equals(name))
            {
                e.setLieu(event.getLieu());
                e.setTime(event.getTime());
                e.setPlace(event.getPlace());
                return;
            }
            System.out.println("Evenet Not found --- " +e);
        }
    }

    
    
    
    
    @Override
    public String toString() {
        return "Eventmanage{" +
                "events=" + events +
                '}';
    }
}

