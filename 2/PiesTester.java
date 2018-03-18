class Pies {
	int wielkosc;
	String rasa;
	String imie;
	
	void szczekaj() {
		System.out.println("Chau! Chauuu!");
	}
	
	void wyswietl() {
		System.out.println("Pies " + imie + " rasy " + rasa + " ma wielkosc " + wielkosc + ".");
	}
}


class PiesTester {
	public static void main(String[] args) {
		Pies p = new Pies();
		p.wielkosc = 40;
		p.rasa = "wilczur";
		p.imie = "Azor";
		p.szczekaj();
		p.wyswietl();
	}
}