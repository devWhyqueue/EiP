
public class Angestellter extends Mitarbeiter {
	
	private double grundgehalt;
	private double ortszuschlag;
	private double zulage;
	
	public Angestellter(String name, double grundgehalt, double ortszuschlag, double zulage) {
		super(name);
		this.grundgehalt = grundgehalt;
		this.ortszuschlag = ortszuschlag;
		this.zulage = zulage;
	}
	

	public double getGrundgehalt() {
		return grundgehalt;
	}

	public void setGrundgehalt(double grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public double getOrtszuschlag() {
		return ortszuschlag;
	}

	public void setOrtszuschlag(double ortszuschlag) {
		this.ortszuschlag = ortszuschlag;
	}

	public double getZulage() {
		return zulage;
	}

	public void setZulage(double zulage) {
		this.zulage = zulage;
	}
	public double berechneGehalt(){
		return grundgehalt + ortszuschlag + zulage;
	}
}
