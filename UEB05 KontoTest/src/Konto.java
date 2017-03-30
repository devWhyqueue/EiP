
public class Konto {
	
	private static int anzahlKonten = 0;
	
	private int kontonummer;
	private double kontostand = 0.0;
	
	public Konto(){
		kontonummer = anzahlKonten + 10000;
		anzahlKonten++;
	}
	
	public Konto(double kontostand){
		this.kontostand = kontostand;
		kontonummer = anzahlKonten + 10000;
		anzahlKonten++; // ++ geht auch vorher (nachschlagen!!)
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}
	
	public void einzahlen(double betrag){
		kontostand += betrag;
	}

	public void auszahlen(double betrag){
		kontostand -= betrag;
	}
	
	public String toString(){
		return kontonummer + " " + kontostand;
	}
}
