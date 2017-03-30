
public class Dozent {
	String name;
	String lehrgebiet;
	boolean dekan = false;
	char geschlecht;
	
	Dozent(String neuerName, String einLehrgebiet, char einGeschlecht){
		name = neuerName;
		lehrgebiet = einLehrgebiet;
		geschlecht = einGeschlecht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLehrgebiet() {
		return lehrgebiet;
	}

	public void setLehrgebiet(String lehrgebiet) {
		this.lehrgebiet = lehrgebiet;
	}

	public boolean isDekan() {
		return dekan;
	}

	public void setDekan(boolean dekan) {
		this.dekan = dekan;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}
	
}