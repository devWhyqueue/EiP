package eif2012;

import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{
		// Umwandler convert = new Umwandler();
		// int[][] test = { { 5, 3, 7, 1 }, { 2, 0, 6, 9, 4 }, { 3, 8 } };
		// System.out.println(Arrays.toString(convert.wandle(test)));

		// Jahreszeit season = new Jahreszeit();
		// System.out.println(season.jahreszeit(-2));

		Tabelle pTabelle = new Tabelle();
		System.out.println(Arrays.deepToString(pTabelle.erzeugePTabelle(10)));
	}
}
