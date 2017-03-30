
public class Ausleihe {
	
	private Mahnung mahnung;
	private Medium medium;
	
	public Ausleihe(Medium medium){
		this.medium = medium;
	}
	
	public Mahnung getMahnung() {
		return mahnung;
	}

	public void setMahnung(Mahnung mahnung) {
		this.mahnung = mahnung;
	}
	
	public void removeMahnung(){
		mahnung = null;
	}

}
