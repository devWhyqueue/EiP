
public class Manager extends Mitarbeiter {
	
	private double festgehalt;
	private double umsatz;
	private double provision;
	
	public Manager(String name, double festgehalt, double umsatz, double provision) {
		super(name);
		this.festgehalt = festgehalt;
		this.umsatz = umsatz;
		this.provision = provision;
	}
	

	public double getFestgehalt() {
		return festgehalt;
	}

	public void setFestgehalt(double festgehalt) {
		this.festgehalt = festgehalt;
	}

	public double getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(double umsatz) {
		this.umsatz = umsatz;
	}

	public double getProvision() {
		return provision;
	}

	public void setProvision(double provision) {
		this.provision = provision;
	}

	public double berechneGehalt(){
		return festgehalt + umsatz * provision;
	}
	
}
