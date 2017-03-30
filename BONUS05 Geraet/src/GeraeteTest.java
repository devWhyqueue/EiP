
public class GeraeteTest {

	public static void main(String[] args) {
		
		Laserdrucker einDrucker = new Laserdrucker("Drucker");
		Faxgeraet einFaxgeraet = new Faxgeraet("Fax");
		Kombigeraet einKombi = new Kombigeraet("Kombi");
		
		druckeTestseite(einDrucker);
		
		sendeTestseite(einFaxgeraet);
		
		druckeTestseite(einKombi);
		sendeTestseite(einKombi);

	}
	
	private static void druckeTestseite(DruckerI derDrucker){
		
		derDrucker.drucken("Testseite");
	}
	
	private static void sendeTestseite(FaxI dasFaxgeraet){
		
		dasFaxgeraet.senden("Testseite");
	}

}
