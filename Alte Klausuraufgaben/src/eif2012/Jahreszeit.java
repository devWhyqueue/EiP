package eif2012;

public class Jahreszeit
{

	public Jahreszeit()
	{
		// TODO Auto-generated constructor stub
	}

	public String jahreszeit(int n)
	{
		String ausgabe = "Fehler";

		switch (n)
			{
			case 1:
				ausgabe = "Frühling";
				break;
			case 2:
				ausgabe = "Sommer";
				break;
			case 3:
				ausgabe = "Herbst";
			case 4:
				ausgabe = "Winter";
				break;
			}
		return ausgabe;
	}

}
