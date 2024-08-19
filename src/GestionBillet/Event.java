package GestionBillet;

import java.util.Date;

public class Event {
    private String name;
    private String lieu;
    private Date time;
    private int place;
    private int nombreB;

    public Event( String name, String lieu, Date time, int place) {
        this.name = name;
        this.lieu = lieu;
        this.time = time;
        this.place = place;
        this.nombreB = nombreB;
    }

    public int getNombreB() {
        return nombreB;
    }

    public void setNombreB(int nombreB) {
        this.nombreB = nombreB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", lieu='" + lieu + '\'' +
                ", time=" + time +
                ", place=" + place +
                '}';
    }
}
