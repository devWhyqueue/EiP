package eip2015;

public class Spiegel
{
	char[][] feld;

	public Spiegel(int n)
	{
		if (n < 5)
			n = 5;
		else if (n % 2 == 0)
			n = n + 1;
		// Ergänzen Sie den Programmcode zur Erzeugung
		// des Feldobjekts! Das erzeugte Array soll
		// QUADRATISCH sein.
		feld = new char[n][n];
	}

	public void fuelleFeld(char oben, char unten)
	{
		for (int zeile = 0; zeile < feld.length; zeile++)
		{
			for (int spalte = 0; spalte < feld[zeile].length; spalte++)
			{
				if (zeile == feld.length / 2)
					feld[zeile][spalte] = '=';
				else if (zeile < feld.length / 2)
					feld[zeile][spalte] = oben;
				else
					feld[zeile][spalte] = unten;

			}
		}
	}

	public void fuelleOberesDreieck(char fuellzeichen)
	{
		for (int zeile = 0; zeile < feld.length / 2; zeile++)
		{
			for (int spalte = 0; spalte < feld[zeile].length; spalte++)
			{
				if (spalte > zeile && spalte < feld.length - (zeile + 1))
					feld[zeile][spalte] = fuellzeichen;
			}
		}
	}

	public void spiegele(char zuSpiegelndesZeichen)
	{
		for (int zeile = 0; zeile < feld.length / 2; zeile++)
		{
			for (int spalte = 0; spalte < feld[zeile].length; spalte++)
			{
				if (feld[zeile][spalte] == zuSpiegelndesZeichen)
				{
					feld[feld.length / 2 + (feld.length / 2 - zeile)][spalte] = zuSpiegelndesZeichen;
				}
			}
		} //durchsuche oberes Array
	}

	public void ausgeben()
	{
		for (int zeile = 0; zeile < feld.length; zeile++)
		{
			for (int spalte = 0; spalte < feld[zeile].length; spalte++)
			{
				System.out.print(feld[zeile][spalte] + " ");
			}
			System.out.println();
		}
	}
}
