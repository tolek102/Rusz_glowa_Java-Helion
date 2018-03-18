import java.util.ArrayList;

class ProstyPortalGra {
    public static void main(String[] args) {
        ArrayList<String> startPolozenia = new ArrayList<>();
        int iloscRuchow = 0;
        ProstyPortal portal = new ProstyPortal();
        PobieranieDanych pobieranie = new PobieranieDanych();
        String wynik = "pudlo";

        int[] polozenia = new int[3];
        int start = (int)(Math.random() * 6);
        for(int i=0;i<polozenia.length;i++) {
            if( i == 0) {
                polozenia[i] = start;  // pierwsza zajęta komórka
            } else {
                polozenia[i] = polozenia[0] + i;        //dwie kolejne zajęte komórki
            }
            //System.out.println(polozenia[i]+" "+i);    - testowanie czy na pewno podaje 3 kolejne pola
            String polozeniaS = Integer.toString(polozenia[i]);		//zamieniamy int na string bo nasz ArrayList przechowuje elementy typu string
            startPolozenia.add(polozeniaS);							//dodajemy kolejne element polozeniaS do naszej ArrayList
            //System.out.println("polozenia["+i+"]: "+polozenia[i]+", polozeniaS:"+polozeniaS);
        }
        portal.setPolaPolozenia(startPolozenia);

        while(!wynik.equals("zatopiony")) {		//powtarzaj do puki wynik to nie "zatopiony"
            String wybranePole = pobieranie.zgaduj();
            iloscRuchow++;
            wynik = portal.sprawdz(wybranePole);
        }
        System.out.println("Gratulacje, wygrales. Twoj wynik to: "+iloscRuchow);

    }
}

/*class ProstyPortalTester {
	public static void main(String[] args) {
	ProstyPortal wit = new ProstyPortal();
	
	int[] polozenia = {2,3,4};
	wit.setPolaPolozenia(polozenia);
	
	String wybranePole = "2";
	String wynik = wit.sprawdz(wybranePole);
	
	String wynikTestu = "niepowodzenie";
	if (wynik.equals("trafiony")) {   //dodać pudlo i zatopiony
		wynikTestu = "zakonczony pomyslnie";
	}
	System.out.println(wynikTestu);
	}
}
*/