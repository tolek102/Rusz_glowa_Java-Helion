import java.util.Scanner;

class ProstyPortal {
	int[] polaPolozenia = new int[3];  // private??
	int iloscTrafien = 0;
	
	public String sprawdz(String stringPole) {
		int strzal = Integer.parseInt(stringPole);
		
		String wynik = "pudlo";
		
		for(int pole : polaPolozenia) {
			if (strzal == pole) {
				wynik = "trafiony";
				iloscTrafien++;
				break;
			}
		}
		
		if(iloscTrafien == polaPolozenia.length) {
			wynik = "zatopiony";
		}
		
		System.out.println(wynik);
		return wynik;
	}
		
	void setPolaPolozenia(int[] ppol) {
		polaPolozenia = ppol;
	}
}


class PobieranieDanych {
		public String zgaduj() {
		Scanner pobierz = new Scanner(System.in);
		System.out.print("Typuje pole: ");
		String liczba = pobierz.next();  
		return liczba;
  }
}

class ProstyPortalGra {
	public static void main(String[] args) {
		
		int iloscRuchow = 0;
		ProstyPortal portal = new ProstyPortal();
		PobieranieDanych pobieranie = new PobieranieDanych();
		String wynik = "pudlo";
		int[] polozenia = new int[3];
		
		for(int i=0;i<polozenia.length;i++) {		
			if( i == 0) {
				polozenia[i] = (int)(Math.random() * 6);  // pierwsza zajęta komórka
			} else {
				polozenia[i] = polozenia[0] + i;		//dwie kolejne zajęte komórki
			}
			//System.out.println(polozenia[i]+" "+i);    - testowanie czy na pewno podaje 3 kolejne pola
		}
		portal.setPolaPolozenia(polozenia);
		
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