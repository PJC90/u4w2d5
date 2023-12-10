package Pierpaolo.entities;

public class Libro extends Metadati{
    private String autore;
    private String genere;

    public Libro(String ISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) throws InvalidStringException {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.setAutore(autore);
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) throws InvalidStringException {
        if(autore.length() < 4) throw new InvalidStringException(autore + "è troppo corto, minimo 4 caratteri");
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }
}
