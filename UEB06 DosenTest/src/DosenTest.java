public class DosenTest {

	public static void main(String[] args) {
		Dose ersteDose = new Dose(3.0, 8.0);
		Dose zweiteDose = new Dose(2.0, 5.0);

		System.out.println("Der Umfang der ersten Dose beträgt: " + round(ersteDose.berechneUmfang(), 4) + " LE");
		System.out.println("Die Oberfläche der ersten Dose beträgt: " + round(ersteDose.berechneOberflaeche(), 4) + " FE");
		
		System.out.println("\nDie Deckelfläche der zweiten Dose beträgt: " + round(zweiteDose.berechneDeckelflaeche(), 4) + " FE");
		System.out.println("Das Volumen der zweiten Dose beträgt: " + round(zweiteDose.berechneVolumen(), 4) + " VE");
		System.out.println("Die Mantelfläche der zweiten Dose beträgt: " + round(zweiteDose.berechneMantelflaeche(), 4) + " VE");
	}
	
	public static double round(final double value, final int frac) { 
	        return Math.round(Math.pow(10.0, frac) * value) / Math.pow(10.0, frac); 
	    }
}
