package Pierpaolo.entities;

public class Rivista extends Metadati{
    private Periodicità periodicità;

    public Rivista(String ISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicità = periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }
}
