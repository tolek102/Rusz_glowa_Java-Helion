class Film {
	String tytul;
	String rodzaj;
	int ocena;
	
	void odtworz() {
		System.out.println("Odtwarzamy film.");
	}
}

public class FilmTester {
	public static void main(String[] args) {
		Film f1 = new Film();
		f1.tytul = "Przeminelo z hossa";
		f1.rodzaj = "Tragedia";
		f1.ocena = -2;
		Film f2 = new Film();
		f2.tytul = "Matrix";
		f2.rodzaj = "Akcja";
		f2.ocena = 70;
		f2.odtworz();
		Film f3 = new Film();
		f3.tytul = "Kosmiczne jaja";
		f3.rodzaj = "Komedia";
		f3.ocena = 90;
	}
}
