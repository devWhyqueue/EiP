package eif2012;

public class Tabelle
{

	public Tabelle()
	{
		// TODO Auto-generated constructor stub
	}

	public int[][] erzeugePTabelle(int n)
	{
		int[][] pTabelle = new int[n][n];

		for (int zeile = 0; zeile < pTabelle.length; zeile++) {
			pTabelle[zeile][0] = zeile + 1;
			for (int spalte = 1; spalte < pTabelle[zeile].length; spalte++)
				pTabelle[zeile][spalte] = (zeile + 1) * pTabelle[zeile][spalte - 1];
		}
		return pTabelle;
	}

}
