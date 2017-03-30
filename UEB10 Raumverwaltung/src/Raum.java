
public class Raum {
	
	private char trakt;
	private char etage;
	private int raumNummer;
	private Professor inhaber;
	
	public Raum(char trakt, char etage, int raumNummer){
		this.trakt = trakt;
		this.etage = etage;
		this.raumNummer = raumNummer;
	}

	public Professor getInhaber() {
		return inhaber;
	}

	public void setInhaber(Professor inhaber) {
		this.inhaber = inhaber;
		inhaber.setBuero(this);
	}
	
	public void removeInhaber(){
		inhaber = null;
	}

	public char getTrakt() {
		return trakt;
	}

	public char getEtage() {
		return etage;
	}

	public int getRaumNummer() {
		return raumNummer;
	}
	
	
}
