
public class Faxgeraet extends Geraet implements FaxI {

	public Faxgeraet(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void senden(String text) {
		
		System.out.println("Identifikation des Geräts: " + getIdentifikation());
		System.out.println("Zu sendender Text: " + text);

	}

}
