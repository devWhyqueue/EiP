public class Wochenkalender {
	private String[][] dieEintraege = new String[7][24];

	public Wochenkalender() {
		for(int i = 0; i < dieEintraege.length; i++)
			for(int j = 0; j < dieEintraege[i].length; j++)
				dieEintraege[i][j] = "";
	}

	public void eintragenTermin(int tag, int stunde, String eintrag) {
		dieEintraege[tag-1][stunde] = eintrag;
	}

	public void eintragenLangtermin(int tag, int vonStunde, int bisStunde, String eintrag) {
		for(int aktStunde = vonStunde; aktStunde <= bisStunde; aktStunde++)
			dieEintraege[tag-1][aktStunde] = eintrag;
	}

	public void eintragenSerientermin(int stunde, String eintrag) {
		for(int tag = 0; tag < dieEintraege.length; tag++)
			dieEintraege[tag][stunde] = eintrag;
	}

	public void entfernenTermin(int tag, int stunde) {
		dieEintraege[tag-1][stunde] = "";
	}

	public String abfragenTermin(int tag, int stunde) {
		return dieEintraege[tag-1][stunde];
	}
}