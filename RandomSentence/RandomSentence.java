class RandomSentence {
	public static void main(String[] args){
		
		String[] list1 = {"architektura wielowarstwowa", "30000 metrów", "rozwiązanie B-do-B", "aplikacja kliencka", "interfejs internetowy", "inteligentna karta", "rozwiązanie dynamiczne", "sześć sigma", "przenikliwość"};
		
		String[] list2 = {"zwiększa moiżliwości", "poprawia atrakcyjność", "pomnaża wartość", "opracowana dla", "bazująca na", "rozporszona", "sieciowa", "skoncentrowana na", "przeniesiona na wyższy poziom", "skierowanej", "udostępniona"};
		
		String[] list3 = {"procesu", "punktu wpisywania", "rozwiązania", "strategii", "paradygmatu", "portalu", "witryny", "wersji", "misji"};
		
		int list1Length = list1.length;
		int list2Length = list2.length;
		int list3Length = list3.length;
		
		int rnd1 = (int) (Math.random() * list1Length);
		int rnd2 = (int) (Math.random() * list2Length);
		int rnd3 = (int) (Math.random() * list3Length);
		
		String zdanie = list1[rnd1] + " " + list2[rnd2] + " " + list3[rnd3];
		System.out.println("To jest to, czego nam trzeba: " + zdanie);
	}
}