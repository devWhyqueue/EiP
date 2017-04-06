package eip2015;

import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{
		//		ZeichenAusFeld liefern = new ZeichenAusFeld();
		//		int[] zeichen = { 1, 2, 3 };
		//
		//		System.out.println(liefern.liefereZeichen("Yannik", zeichen));
		//		System.out.println(liefern.entferneZeichen("Yannik", zeichen));

		//		Spiegel spiegeln = new Spiegel(8);
		//
		//		spiegeln.fuelleFeld('f', 'g');
		//		spiegeln.fuelleOberesDreieck('A');
		//		spiegeln.spiegele('f');
		//		spiegeln.ausgeben();

		Sortierung sortiere = new Sortierung();
		int[] a = { 1, 5 };
		int[] b = { 2, 4 };

		System.out.println(Arrays.toString(sortiere.merge(a, b)));

	}

}
