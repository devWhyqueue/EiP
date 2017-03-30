
public class Dose {
	
	private double radius;
	private double hoehe;
	
	public Dose(double radius, double hoehe) {
		this.radius = radius;
		this.hoehe = hoehe;
	}

	public double getRadius() {
		return radius;
	}

	public double getHoehe() {
		return hoehe;
	}
	
	public double berechneUmfang() {
		return 2 * Math.PI * radius;
	}
	
	public double berechneDeckelflaeche() {
		return Math.PI * radius * radius;
	}
	
	public double berechneMantelflaeche() {
		return berechneUmfang() + hoehe;
	}
	
	public double berechneOberflaeche() {
		return 2 * berechneDeckelflaeche() + berechneMantelflaeche();
	}
	
	public double berechneVolumen() {
		return berechneDeckelflaeche() * hoehe;
	}
}
