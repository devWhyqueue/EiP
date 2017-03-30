
public class Geschaeftsfuehrer extends Manager {
	
	private double zulage;

	public Geschaeftsfuehrer(String name, double festgehalt, double umsatz, double provision, double zulage) {
		super(name, festgehalt, umsatz, provision);
		this.zulage = zulage;
	}

	public double getZulage() {
		return zulage;
	}
	
	public void setZulage(double zulage) {
		this.zulage = zulage;
	}
	
	public double berechneGehalt(){
		return super.berechneGehalt() + zulage;
	}


}
