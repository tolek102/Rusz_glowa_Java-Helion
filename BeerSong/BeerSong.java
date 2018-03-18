class BeerSong {
	public static void main(String[] args){
		int IloscButelek = 99;
		String slowo = "bottles";
		while (IloscButelek > 0) {
		System.out.println(IloscButelek + " " + slowo + " of beer on the wall");
		System.out.println(IloscButelek + " " + slowo + " of beer.");
		System.out.println("Take one down");
		System.out.println("Pass it around");
		IloscButelek = IloscButelek - 1;
		if (IloscButelek == 1) {
				slowo = "bottle";
			}
		if (IloscButelek > 0) {
			System.out.println(IloscButelek + " " + slowo + " of beer on the wall");
		} else {
			System.out.println("No more bottles of beer on the wall");
		}
		}
	}
}