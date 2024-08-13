package Gestionmdicaments;

import java.time.LocalDate;
import java.time.Month;

public class StockReception {
    private int id;
    private Medicaments medicament;
    private LocalDate date;
    private int qantite;

    public StockReception(int id, Medicaments medicament, LocalDate date, int qantite) {
        this.id = id;
        this.medicament = medicament;
        this.date = date;
        this.qantite = qantite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medicaments getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicaments medicament) {
        this.medicament = medicament;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQantite() {
        return qantite;
    }

    public void setQantite(int qantite) {
        this.qantite = qantite;
    }

    @Override
    public String toString() {
        return "StockReception{" +
                "id=" + id +
                ", medicament=" + medicament +
                ", date=" + date +
                ", qantite=" + qantite +
                '}';
    }
}
