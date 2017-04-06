package eip2014;

public class Matrix
{
	private int[][] data;

	public Matrix(int dim)
	{
		data = new int[dim][dim];
	}

	public void fuelleMatrix()
	{

		for (int zeile = 0; zeile < data.length; zeile++)
		{
			for (int spalte = 0; spalte < data[zeile].length; spalte++)
			{
				data[zeile][spalte] = spalte - zeile;
			}
		}
	}

	public String toString()
	{
		String str = "";

		for (int zeile = 0; zeile < data.length; zeile++)
		{
			for (int spalte = 0; spalte < data[zeile].length; spalte++)
			{
				str += data[zeile][spalte] + " ";
			}
			str += "\n";
		}

		return str;
	}

}
