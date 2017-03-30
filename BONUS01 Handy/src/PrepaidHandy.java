
public class PrepaidHandy {
	
	private static int anzahlHandys = 0; // Klassenattribut, damit sich der Wert bei der Erzeugung eines neuen Objekts erhöht (Anzahl wird EINMAL bei der Erstellung der Klasse auf 0 gesetzt)
	
	private int seriennummer;
	private String pin;
	private double guthaben = 0.0;

	public PrepaidHandy(String pin) {
		this.pin = pin;
		seriennummer = anzahlHandys + 123456;
		anzahlHandys++;
	}

	public int getSeriennummer() {
		return seriennummer;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public double getGuthaben() {
		return guthaben;
	}
	
	public void setGuthaben(double guthaben){
		this.guthaben = guthaben;
	}

	public void aufladen(double betrag) {
		this.guthaben += betrag;
	}
	
	public void telefonieren(){
		this.guthaben -= 0.25;
	}
	
	public String toString() {
		return "PrepaidHandy [seriennummer=" + seriennummer + ", pin=" + pin + ", guthaben=" + guthaben + "]";
	}
}
