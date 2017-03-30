
public class Main {

	public static void main(String[] args) {
		
		Arbeiter ersterArbeiter = new Arbeiter("Klaus", 25.00, 200, 100.00, 10);
		Angestellter ersterAngestellter = new Angestellter("Vincent", 500.00, 100.00, 50.00);
		Manager ersterManager = new Manager("Justus", 1000.00, 2000.00, 500.00);
		Geschaeftsfuehrer ersterGeschaeftsfuehrer = new Geschaeftsfuehrer("Herbert", 10000, 5000.00, 500.00, 200.00);
		
		System.out.println("Das Gehalt des Arbeiters betr�gt: " + ersterArbeiter.berechneGehalt());
		System.out.println("Das Gehalt des Angestellten betr�gt: " + ersterAngestellter.berechneGehalt());
		System.out.println("Das Gehalt des Managers betr�gt: " + ersterManager.berechneGehalt());
		System.out.println("Das Gehalt des Gesch�ftsf�hrers betr�gt: " + ersterGeschaeftsfuehrer.berechneGehalt());
		
		System.out.println("Die Personalnummer des Managers betr�gt: " + ersterManager.getPersonalnummer());

	}

}
