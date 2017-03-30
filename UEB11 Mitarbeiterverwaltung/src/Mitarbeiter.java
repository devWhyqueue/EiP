
public abstract class Mitarbeiter {

	private String name;
	private int personalnummer;
	private static int anzahlMitarbeiter = 0;
	
	public Mitarbeiter(String name){
		this.name = name;
		anzahlMitarbeiter++;
		this.personalnummer = anzahlMitarbeiter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPersonalnummer() {
		return personalnummer;
	}
	
	public abstract double berechneGehalt();
		
}
