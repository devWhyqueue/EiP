
public class Kombigeraet extends Geraet implements DruckerI, FaxI {

	public Kombigeraet(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void senden(String text) {
		
		System.out.println("Identifikation des Geräts: " + getIdentifikation());
		System.out.println("Zu sendender Text: " + text);

	}

	@Override
	public void drucken(String text) {
		
		System.out.println("Identifikation des Geräts: " + getIdentifikation());
		System.out.println("Zu druckender Text: " + text);

	}

}
