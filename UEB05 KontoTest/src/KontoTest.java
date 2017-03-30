
public class KontoTest {

	public static void main(String[] args) {
		Konto erstesKonto = new Konto();
		Konto zweitesKonto = new Konto(221536.22);
		
		System.out.println("Kontonummer: " + erstesKonto.getKontonummer());
		System.out.println("Kontonummer und Kontostand: " + erstesKonto); // Klassenname und Speicheradresse (in String umgewandelt) wird ausgegeben
		erstesKonto.einzahlen(55.22);
		System.out.println("Kontostand nach Einzahlung: " + erstesKonto.getKontostand());
		erstesKonto.auszahlen(22.23);
		System.out.println("Kontostand nach Auszahlung: " + erstesKonto.getKontostand());
		
		System.out.println("Kontonummer: " + zweitesKonto.getKontonummer());
		zweitesKonto.einzahlen(2.22);
		System.out.println("Kontostand nach Einzahlung: " + zweitesKonto.getKontostand());
		zweitesKonto.auszahlen(55222.33);
		System.out.println("Kontostand nach Auszahlung: " + zweitesKonto.getKontostand());
	}

}
