
public class Main {

	public static void main(String[] args) {
		
		Kunde ersterKunde = new Kunde("Paul");
		Kunde zweiterKunde = new Kunde("Peter");
		
		Buch einBuch = new Buch("Eprog", 2);
		Buch zweitesBuch = new Buch("Botanik", 500);
		EBook einEBook = new EBook("Windows", 1);
		EBook zweitesEBook = new EBook("Soziologie", 10);
		
		ersterKunde.mediumAusleihen(einBuch);
		ersterKunde.mediumAusleihen(zweitesEBook);
		zweiterKunde.mediumAusleihen(einEBook);
		
		Mahnung neueMahnung = new Mahnung(1);
		ersterKunde.mahnungEintragen(0, neueMahnung);
		
		System.out.println(ersterKunde.mediumZurueckgeben(0));
		System.out.println(ersterKunde.mediumZurueckgeben(1));
		System.out.println(zweiterKunde.mediumZurueckgeben(0));
	}

}
