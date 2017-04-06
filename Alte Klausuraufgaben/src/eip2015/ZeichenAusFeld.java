package eip2015;

public class ZeichenAusFeld
{

	public ZeichenAusFeld()
	{
		// TODO Auto-generated constructor stub
	}

	public String liefereZeichen(String str, int[] feld)
	{
		String ausgabe = "";

		for (int i = 0; i < feld.length; i++)
		{
			ausgabe += str.charAt(feld[i] - 1);
		}

		return ausgabe;
	}

	public String entferneZeichen(String str, int[] feld)
	{
		String ausgabe = "";
		boolean inFeld = false;

		for (int iStr = 0; iStr < str.length(); iStr++) // String durchgehen
		{
			for (int jFeld = 0; jFeld < feld.length; jFeld++) //Feld durchgehen
			{
				if (feld[jFeld] - 1 == iStr) // Wenn Element in Feld
				{
					inFeld = true;
				}
			}
			if (!inFeld)
				ausgabe += str.charAt(iStr);
			inFeld = false;
		}
		return ausgabe;
	}

}
