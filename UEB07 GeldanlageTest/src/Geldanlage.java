
public class Geldanlage {

	private double startkapital;
	private double zinssatz;

	public Geldanlage(double startkapital, double zinssatz) {
		this.startkapital = startkapital;
		this.zinssatz = zinssatz;
	}

	public double getStartkapital() {
		return startkapital;
	}

	public double getZinssatz() {
		return zinssatz;
	}

	public double berechneEndkapital(int laufzeit) {
		double altesKapital, neuesKapital;
		altesKapital = neuesKapital = startkapital;
		
		while (laufzeit > 0) {
			neuesKapital = altesKapital * (1 + zinssatz / 100);
			altesKapital = neuesKapital;
			laufzeit--;
		}

		return neuesKapital;
	}
}
