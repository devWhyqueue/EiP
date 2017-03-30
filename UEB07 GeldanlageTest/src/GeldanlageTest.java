import java.util.Scanner;

public class GeldanlageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie jetzt das Startkapital ein: ");
		double startkapital = sc.nextDouble();
		System.out.println("Geben Sie bitte nun den Zinssatz ein: ");
		double zinssatz = sc.nextDouble();
		sc.close();
		
		Geldanlage anlage = new Geldanlage(startkapital, zinssatz);
		
		System.out.println("Das Endkapital für eine Laufzeit von drei Jahren beträgt: " + round(anlage.berechneEndkapital(3), 2) + "€");
		System.out.println("Das Endkapital für eine Laufzeit von acht Jahren beträgt: " + round(anlage.berechneEndkapital(8), 2) + "€");

	}
	
	public static double round(final double value, final int frac) { 
        return Math.round(Math.pow(10.0, frac) * value) / Math.pow(10.0, frac); 
    }

}
