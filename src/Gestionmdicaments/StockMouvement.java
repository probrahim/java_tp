package Gestionmdicaments;

import java.time.LocalDate;

public class StockMouvement {
    private int id;
    private Typee status;
    private Medicaments medicament;
    public int quanite;
    private LocalDate time;

    public StockMouvement(int id, Typee status, Medicaments medicament, int quanite, LocalDate time) {
        this.id = id;
        this.status = status;
        this.medicament = medicament;
        this.quanite = quanite;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Typee getStatus() {
        return status;
    }

    public void setStatus(Typee status) {
        this.status = status;
    }

    public Medicaments getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicaments medicament) {
        this.medicament = medicament;
    }

    public int getQuanite() {
        return quanite;
    }

    public void setQuanite(int quanite) {
        this.quanite = quanite;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
}
