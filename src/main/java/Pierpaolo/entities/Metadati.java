package Pierpaolo.entities;

abstract public class Metadati {
    protected String ISBN;
    protected String titolo;
    protected int annoPubblicazione;
    protected int numeroPagine;

    public Metadati(String ISBN, String titolo, int annoPubblicazione, int numeroPagine) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.setAnnoPubblicazione(annoPubblicazione);
        this.numeroPagine = numeroPagine;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        if(annoPubblicazione < 2000) throw new YearLess200(annoPubblicazione);
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }
}
