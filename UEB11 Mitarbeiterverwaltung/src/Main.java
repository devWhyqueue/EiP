
public class Main {

	public static void main(String[] args) {
		
		Arbeiter ersterArbeiter = new Arbeiter("Klaus", 25.00, 200, 100.00, 10);
		Angestellter ersterAngestellter = new Angestellter("Vincent", 500.00, 100.00, 50.00);
		Manager ersterManager = new Manager("Justus", 1000.00, 2000.00, 500.00);
		Geschaeftsfuehrer ersterGeschaeftsfuehrer = new Geschaeftsfuehrer("Herbert", 10000, 5000.00, 500.00, 200.00);
		
		System.out.println("Das Gehalt des Arbeiters beträgt: " + ersterArbeiter.berechneGehalt());
		System.out.println("Das Gehalt des Angestellten beträgt: " + ersterAngestellter.berechneGehalt());
		System.out.println("Das Gehalt des Managers beträgt: " + ersterManager.berechneGehalt());
		System.out.println("Das Gehalt des Geschäftsführers beträgt: " + ersterGeschaeftsfuehrer.berechneGehalt());
		
		System.out.println("Die Personalnummer des Managers beträgt: " + ersterManager.getPersonalnummer());

	}

}
