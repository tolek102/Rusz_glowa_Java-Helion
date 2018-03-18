import java.util.Scanner;
import java.util.*;

public class PomocnikGry {      //deklaracja wielkości planszy i utworzenie pustej planszy do gry
    private static final String ALFABET = "abcdefg";
    private final int DLUGOSC_PLANSZY = 7;
    private final int WIELKOSC_PLANSZY = 49;
    private int [] plansza = new int[WIELKOSC_PLANSZY];
    private int iloscPortali = 0;
/*    public String pobierzDaneWejsciowe(String komunikat) {
        String daneWejsciowe = null;
        System.out.print(komunikat + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            daneWejsciowe = is.readLine();
            if (daneWejsciowe.length() == 0 ) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return daneWejsciowe.toLowerCase();
*/

    String pobierzDaneWejsciowe(){      //pobieranie danych wpisanych przez użytkownika
        Scanner pobierz = new Scanner(System.in);
        System.out.print("Strzelam w pole o współrzędnych: ");
        String wytypowane_pole = pobierz.next();
        return wytypowane_pole.toLowerCase();

    }
    public ArrayList rozmiescPortal(int wielkoscPortalu) {      //rozmieszczanie portali na planszy
        ArrayList<String> zajetePola = new ArrayList<String>();
        String [] wspolrzedneLnc = new String [wielkoscPortalu]; // zawiera współrzdne zapisane jako ‘f6’
        String pomoc = null; // pomocniczy	łacuch znaków
        int [] wspolrzedne = new int[wielkoscPortalu]; // bieżące proponowane współrzdne
        int prob = 0; // licznik iloci prób
        boolean powodzenie = false; // flaga = czy znaleziono dobre miejsce
        int polozenie = 0; // bieżące miejsce początkowe
        iloscPortali++; // n-ty portal do rozmieszczenia
        int inkr = 1; // określenie przyrostu w poziomie
        if ((iloscPortali % 2) == 1) { // jeli nieparzysty portal (rozmieszczany w pionie)
            inkr = DLUGOSC_PLANSZY; // określenie przyrostu w pionie
        }
        while (!powodzenie & prob++ < 200 ) { // główna pętla poszukiwania
            polozenie = (int) (Math.random() * WIELKOSC_PLANSZY); // wybór losowego punktu pocztkowego
//System.out.print(" sprawdz " + polozenie);
            int x = 0; // n-ty fragment rozmieszczanego portalu
            powodzenie = true; // zakładamy, że się udało
            while (powodzenie && x < wielkoscPortalu) { // szukamy sąsiadujcych pustych pól planszy
                if (plansza[polozenie] == 0) { // jeśli jeszcze nie zajęte
                    wspolrzedne[x++] = polozenie; // zapisujemy miejsce
                    polozenie += inkr; // sprawdzamy ‘nastpne’ sąsiadujące pole
                    if (polozenie >= WIELKOSC_PLANSZY){ // poza zakresem - ‘dół’ planszy
                        powodzenie = false; // niepowodzenie
                    }
                    if (x>0 & (polozenie % DLUGOSC_PLANSZY == 0)) { // poza zakresem - prawa krawędź planszy
                                powodzenie = false; // niepowodzenie
                    }
                } else { // znalezione pole już jest zajęte
//System.out.print("już zajęte" + zajetePola);
                    powodzenie = false; // niepowodzenie
                }
            }
        } // koniec while
        int x = 0; // zamieniamy na współrzdne
        int wiersz = 0;
        int kolumna = 0;
// System.out.println(”\n”);
        while (x < wielkoscPortalu) {
            plansza[wspolrzedne[x]] = 1; // zaznaczamy pole planszy jako zajęte
            wiersz = (int) (wspolrzedne[x] / DLUGOSC_PLANSZY); // określenie wiersza
            kolumna = wspolrzedne[x] % DLUGOSC_PLANSZY; // pobranie liczby określającej kolumnę
            pomoc = String.valueOf(ALFABET.charAt(kolumna)); // konwersja do postaci alfanumerycznej
            zajetePola.add(pomoc.concat(Integer.toString(wiersz)));
            x++;
//System.out.print(" współrzędne "+x+" = "+zajetePola.get(x-1));
        }
//System.out.println("\n");
        return zajetePola;
    }
}