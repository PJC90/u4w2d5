package Pierpaolo;

import Pierpaolo.entities.Libro;
import Pierpaolo.entities.Metadati;
import Pierpaolo.entities.Periodicità;
import Pierpaolo.entities.Rivista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Libro libro1 = new Libro("45678-45962","Sapiens",2018,345,"Juval Noah Harari","Storico");
        Rivista rivista1 = new Rivista("7490-4516","Al Volante",2023,330, Periodicità.MENSILE);
        Libro libro2 = new Libro("41678-4592","Homo-Deus",2020,399,"Juval Noah Harari","Storico");
        Rivista rivista2 = new Rivista("490-4516","Topolino",2023,210, Periodicità.SETTIMANALE);
        Libro libro3 = new Libro("5778-4562","Il nuovo Java",2015,857,"Claudio De Sio Cesari","Informatica");
        Rivista rivista3 = new Rivista("890-416","Nature",2022,610, Periodicità.ANNUALE);

        System.out.println("-------------------------------------------------   es 1   --------------------------------------------------------");
        System.out.println("----------------------------------------     aggiunta elementi   --------------------------------------------------");

        List<Metadati> archivio = new ArrayList<>(Arrays.asList(libro1, libro2, libro3, rivista1, rivista2, rivista3));

        archivio.stream().map(elementi->elementi.getTitolo()).forEach(System.out::println);

        System.out.println();
        System.out.println("-------------------------------------------------   es 2   --------------------------------------------------------------");
        System.out.println("--------------------------------     rimozione elemento dato un ISBN   --------------------------------------------------");
        String topolinoISBN = "490-4516";
        Iterator<Metadati> iterator = archivio.iterator();
        while (iterator.hasNext()){
            Metadati elementoCorrente = iterator.next();
            if(elementoCorrente.getISBN().equals(topolinoISBN)){
                iterator.remove();
            }
        }
        archivio.forEach(prodotto-> System.out.println(prodotto.getTitolo()));
        System.out.println();
        System.out.println("-------------------------------------------------   es 3   --------------------------------------------------------------");
        System.out.println("--------------------------------     ricerca elemento dato un ISBN   --------------------------------------------------");
        String sapiensISBN = "45678-45962";
        List<Metadati> ricercaISBN = archivio.stream().filter(prodotto->prodotto.getISBN().equals(sapiensISBN)).toList();
        ricercaISBN.forEach(ricerca-> System.out.println("Ricerca da ISBN: " + ricerca.getTitolo()));







    }
}
