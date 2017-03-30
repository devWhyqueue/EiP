package eif2012;

public class DinNorm
{

	public DinNorm()
	{
		// TODO Auto-generated constructor stub
	}

	public boolean istDin(int breite, int hoehe)
	{
		boolean isDin = false;

		if ((breite == 210 && hoehe == 297) || (breite == 148 && hoehe == 210) || (breite == 105 && hoehe == 148))
			isDin = true;

		return isDin;
	}

}
