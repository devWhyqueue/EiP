package eip2014;

public class Stern
{
	private char[][] stern;

	public Stern(int n)
	{
		if (n < 5)
			stern = new char[5][5];
		else if (n % 2 != 0)
			stern = new char[n][n];
		else
			stern = new char[n + 1][n + 1];
	}

	public void erzeugeSternMuster()
	{

		for (int zeile = 0; zeile < stern.length; zeile++)
		{
			for (int spalte = 0; spalte < stern[zeile].length; spalte++)
			{

				if (zeile == spalte || zeile == stern.length / 2 || spalte == stern[zeile].length / 2
					|| zeile + spalte == stern.length - 1)
					stern[zeile][spalte] = '*';
			}
		}
	}

	public void ausgeben()
	{
		for (int zeile = 0; zeile < stern.length; zeile++)
		{
			for (int spalte = 0; spalte < stern[zeile].length; spalte++)
			{
				System.out.print(stern[zeile][spalte] + " ");
			}
			System.out.println();
		}
	}

}
