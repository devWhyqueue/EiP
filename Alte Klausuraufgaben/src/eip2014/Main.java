package eip2014;

public class Main
{

	public static void main(String[] args)
	{
		//		StringSort sortierung = new StringSort();
		//		System.out.println(sortierung.sortiereZeichen("Hallo Du Affe"));

		//		Stern einStern = new Stern(8);
		//		einStern.erzeugeSternMuster();
		//		einStern.ausgeben();

		//		StringCount zaehler = new StringCount();
		//		char[] buchstaben = { 'a', 'l', 'f', 'y' };
		//		zaehler.zaehleZeichen("Apokalypse", buchstaben);
		//		zaehler.ausgeben();

		Matrix eineMatrix = new Matrix(5);
		eineMatrix.fuelleMatrix();
		System.out.println(eineMatrix.toString());

	}

}
