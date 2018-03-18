import java.util.ArrayList;

public class Portal {
    private ArrayList<String> polaPolozenia;
    //private String nazwa;

    public void setPolaPolozenia(ArrayList<String> ppol){
        polaPolozenia = ppol;
    }

    void setNazwa(String podanaNazwa){
        String nazwa = podanaNazwa;
    }

    String sprawdz(String ruch){
        String wynik = "pudło";
        int index = polaPolozenia.indexOf(ruch);   //sprawdza czy w ArrayList polaPolozenia znajduje się element o wartości ruch i jeśli tak to podaje index w którym miejscu w ArrayList się znajduje, a jeśli nie znajdzie go to zwraca -1

        if (index >=0) {
            polaPolozenia.remove(index);		//jeśli index >=0 to znaczy że "ruch" został znaleziony w ArrayList w miejscu o indexie "index", usuwamy więc z ArrayList komórkę o indexie "index" więc przy kolejnym wskazaniu tej komórki jako "ruch" zwróci nam -1 czyli nie policzy 2 razy tego samego pola jako trafione

            if (polaPolozenia.isEmpty()) {		//jeżeli w tablicy ArrayList nie ma już żadnych elementów (wszystkie zostały usunięte) oznacza to że grać trafił wszystkie pola / zatopił wszystkie elementy portalu
                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;
    }
}

