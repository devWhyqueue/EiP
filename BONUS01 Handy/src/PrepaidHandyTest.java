
public class PrepaidHandyTest {

	public static void main(String[] args) {
	
		PrepaidHandy erstesHandy = new PrepaidHandy("1234");
		PrepaidHandy zweitesHandy = new PrepaidHandy ("4321");
		
		System.out.println(erstesHandy.toString());
		System.out.println(zweitesHandy.toString());
		
		erstesHandy.setPin("0000");
		zweitesHandy.setPin("0815");
		System.out.println("Geänderte PIN des ersten Handys: " + erstesHandy.getPin());
		System.out.println("Geänderte PIN des zweiten Handys: " + zweitesHandy.getPin());
		
		erstesHandy.aufladen(15.0);
		System.out.println("Nach der Aufladung beträgt das aktuelle Guthaben des ersten Handys: " + erstesHandy.getGuthaben());
		erstesHandy.telefonieren();
		System.out.println("Nach dem Telefonat beträgt das aktuelle Guthaben des ersten Handys: " + erstesHandy.getGuthaben());
		erstesHandy.telefonieren();
		System.out.println("Nach dem Telefonat beträgt das aktuelle Guthaben des ersten Handys: " + erstesHandy.getGuthaben());
		erstesHandy.aufladen(5.5);
		System.out.println("Nach der Aufladung beträgt das aktuelle Guthaben des ersten Handys: " + erstesHandy.getGuthaben());
		zweitesHandy.aufladen(30.0);
		System.out.println("Nach der Aufladung beträgt das aktuelle Guthaben des zweiten Handys: " + zweitesHandy.getGuthaben());
		zweitesHandy.telefonieren();
		System.out.println("Nach dem Telefonat beträgt das aktuelle Guthaben des zweiten Handys: " + zweitesHandy.getGuthaben());
		zweitesHandy.telefonieren();
		System.out.println("Nach dem Telefonat beträgt das aktuelle Guthaben des zweiten Handys: " + zweitesHandy.getGuthaben());
		zweitesHandy.aufladen(20.5);
		System.out.println("Nach der Aufladung beträgt das aktuelle Guthaben des zweiten Handys: " + zweitesHandy.getGuthaben());
	}

}
