
public class Laserdrucker extends Geraet implements DruckerI {

	public Laserdrucker(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drucken(String text) {
		
		System.out.println("Identifikation des Geräts: " + getIdentifikation());
		System.out.println("Zu druckender Text: " + text);

	}

}
