import java.util.ArrayList;

        public class PortalGraMax {
            private ArrayList<Portal> listaPortali = new ArrayList<>();     //tablica do przechowywania obiaktów typu 'Portal'
            private int iloscRuchow = 0;
            private PomocnikGry pomocnik = new PomocnikGry();

            private void przygotujGre(){
                Portal pierwszy = new Portal();             //utworzenie trzech portali, nadanie im nazwy i dodanie ich do tablicy ArrayList
                pierwszy.setNazwa("pierwszy_portal");
                listaPortali.add(pierwszy);

                Portal drugi = new Portal();
                drugi.setNazwa("drugi_portal");
                listaPortali.add(drugi);

                Portal trzeci = new Portal();
                trzeci.setNazwa("trzeci_portal");
                listaPortali.add(trzeci);

                System.out.println("Twoim celem jest zatopienie trzech portali.");
                System.out.println("Postaraj się je zatopić w jak najmniejszel ilości ruchów.");
                System.out.println("Plansza ma wymiary 7x7. Zakres w pionie 0-6 i poziomie a-g.");

        for(Portal rozmieszczanyPortal: listaPortali){
            ArrayList<String> nowePolozenie = pomocnik.rozmiescPortal(3);
            rozmieszczanyPortal.setPolaPolozenia(nowePolozenie);
        }
    }

    private void rozpocznijGre(){
        while(!listaPortali.isEmpty()){     //dopóki tablica portali NIE jest pusta
            String ruchGracza = pomocnik.pobierzDaneWejsciowe();
            sprawdzRuchGracza(ruchGracza);
        }
        zakonczGre();
    }

    private void sprawdzRuchGracza(String ruch){
        iloscRuchow++;
        String wynik = "pudło";

        for(Portal portalDoSprawdzenia : listaPortali){     //wykonuje kolejno dla każdego elementu znajdującego się w tablicy ArrayList
            wynik = portalDoSprawdzenia.sprawdz(ruch);
            if (wynik.equals("trafiony")){          //jeśli wynikt to zatopiony to usuwa dany portal z ArrayList
                break;
            }
            if (wynik.equals("zatopiony")){          //jeśli wynikt to zatopiony to usuwa dany portal z ArrayList
                listaPortali.remove(portalDoSprawdzenia);
                break;
            }
        }
        System.out.println("Twój wynik to: "+wynik);
    }

    private void zakonczGre(){
        System.out.println("Gra zakończona!!");

        if(iloscRuchow<18){
            System.out.println("Dobrze Ci poszło!!");
            System.out.println("Potrzebowałeś tylko "+ iloscRuchow +" ruchów do zatopienia wszystkich portali");
        } else{
            System.out.println("Słabo Ci poszło!");
            System.out.println("Potrzebwałeś aż "+ iloscRuchow +" ruchów do zatopienia wszystkich portali");
            System.out.println("nawet dzieci w przedszkolu radzą sobie lepiej!!!");
        }
    }

    public static void main(String[] args){
        PortalGraMax gra = new PortalGraMax();
        gra.przygotujGre();
        gra.rozpocznijGre();
    }
}
