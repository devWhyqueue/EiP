/**
 * <b> Bonusaufgabe 3 </b>
 * @author Yannik
 * 
 *
 */
public class Bruch {
	/**
	 * Objektattribute
	 */
	private int zaehler, nenner;
	
	/** 
	 * Konstruktor f�r einen Bruch.
	 * @param zaehler Z�hler des Bruchs
	 * @param nenner Nenner des Bruchs
	 */
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	/**
	 * Konstruktor f�r Bruch mit dem Nenner 1
	 * @param zaehler Z�hler des Bruchs
	 */
	public Bruch(int zaehler) {
		this.zaehler = zaehler;
		nenner = 1;
	}
	
	/**
	 * get-Methoden f�r Z�hler
	 * @return R�ckgabe des Z�hlers
	 */
	public int getZaehler() {
		return zaehler;
	}

	/**
	 * get-Methode f�r Nenner
	 * @return R�ckgabe des Nenners
	 */
	public int getNenner() {
		return nenner;
	}
	
	/**
	 * Multiplikation mit einem ganzzahligen Wert
	 * @param n ganze Zahl
	 */
	public void multipliziere(int n) {
		zaehler *= n;
	}

	/**
	 * Multiplikation mit einem Bruch
	 * @param b Bruch bestehend aus Z�hler und Nenner
	 */
	public void multipliziere(Bruch b) {
		zaehler *= b.getZaehler();
		nenner *= b.getNenner();
	}

	/**
	 * Division durch einen Bruch
	 * @param b Bruch bestehend aus Z�hler und Nenner
	 */
	public void dividiere(Bruch b) {
		int alterZaehler = zaehler;
		zaehler *= b.getNenner();
		nenner *= alterZaehler;
	}
	
	private int berechneGGT(int zaehler, int nenner){
		if(nenner ==0)
			return zaehler;
		else
			return berechneGGT(nenner, zaehler % nenner);
	}
	
	public void kuerzen(){
		int ggt = berechneGGT(zaehler, nenner);
		zaehler /= ggt;
		nenner /= ggt;
	}

	/**
	 * To-String-Methode
	 */
	public String toString() {
		return zaehler + "/" + nenner;
	}

}
