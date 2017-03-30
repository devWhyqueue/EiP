
public class Arbeiter extends Mitarbeiter {
	
	private double stundenlohn;
	private int anzahlArbeitsstunden;
	private double ueberstundenzuschlag;
	private int anzahlUeberstunden;
	
	public Arbeiter(String name, double stundenlohn, int anzahlArbeitsstunden, double ueberstundenzuschlag,
			int anzahlUeberstunden) {
		super(name);
		this.stundenlohn = stundenlohn;
		this.anzahlArbeitsstunden = anzahlArbeitsstunden;
		this.ueberstundenzuschlag = ueberstundenzuschlag;
		this.anzahlUeberstunden = anzahlUeberstunden;
	}
	

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public int getAnzahlArbeitsstunden() {
		return anzahlArbeitsstunden;
	}

	public void setAnzahlArbeitsstunden(int anzahlArbeitsstunden) {
		this.anzahlArbeitsstunden = anzahlArbeitsstunden;
	}

	public double getUeberstundenzuschlag() {
		return ueberstundenzuschlag;
	}

	public void setUeberstundenzuschlag(double ueberstundenzuschlag) {
		this.ueberstundenzuschlag = ueberstundenzuschlag;
	}

	public int getAnzahlUeberstunden() {
		return anzahlUeberstunden;
	}

	public void setAnzahlUeberstunden(int anzahlUeberstunden) {
		this.anzahlUeberstunden = anzahlUeberstunden;
	}
	public double berechneGehalt(){
		return stundenlohn * anzahlArbeitsstunden + ueberstundenzuschlag * anzahlUeberstunden;
	}
}
