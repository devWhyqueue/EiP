
public class Kunde {

	private String name;
	private Ausleihe ausleihe[] = new Ausleihe[50];

	public Kunde(String name) {
		this.name = name;
	}

	public int mediumAusleihen(Medium medium) {
		Ausleihe neueAusleihe = new Ausleihe(medium);

		int i = 0;
		while (ausleihe[i] != null && i < ausleihe.length) {
			i++;
		}
		if (ausleihe[i] == null)
			ausleihe[i] = neueAusleihe;
		else {
			i = -1;
		}

		return i;
	}

	public boolean mediumZurueckgeben(int pos) {
		boolean keineMahnung = false;

		if (ausleihe[pos] != null && ausleihe[pos].getMahnung() == null) {
			ausleihe[pos] = null;
			keineMahnung = true;
		}

		return keineMahnung;
	}

	public void mahnungEintragen(int pos, Mahnung mahnung) {
		if (ausleihe[pos] != null)
			ausleihe[pos].setMahnung(mahnung);
	}
}
