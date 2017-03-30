package eif2012;

public class Umwandler
{

	public Umwandler()
	{
		// TODO Auto-generated constructor stub
	}

	public int[] wandle(int[][] feld)
	{
		int arrayLength = feld.length;
		for (int zeile = 0; zeile < feld.length; zeile++)
			arrayLength += feld[zeile].length;
		int[] ergebnisArray = new int[arrayLength];

		int arrayIndex = 0;
		for (int zeile = 0; zeile < feld.length; zeile++) {
			ergebnisArray[arrayIndex++] = feld[zeile].length;
			for (int spalte = 0; spalte < feld[zeile].length; spalte++) {
				ergebnisArray[arrayIndex++] = feld[zeile][spalte];
			}
		}
		return ergebnisArray;
	}

}
