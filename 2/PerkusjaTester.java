class Perkusja {
	boolean talerze = true;
	boolean beben = true;
	
	void zagrajNaBebnie() {
		System.out.println("bam, bam, baaaa-am-am");
	}

	void zagrajNaTalerzach() {
		System.out.println("brzdek, brzrzrzdeek");
	}
}

class PerkusjaTester {
	public static void main(String[] args) {

		Perkusja p = new Perkusja();

		p.zagrajNaBebnie();
		p.beben = false;
		p.zagrajNaTalerzach();

		if (p.beben == true) {
			p.zagrajNaBebnie();
		}
	}
}