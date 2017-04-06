package eip2017;

public class Aufgaben
{

	public static void main(String[] args)
	{
		pascalDreieck(5);
		System.out.println(quersumme(45644));
		System.out.println(nUeberK(0, 0));
	}

	public static void pascalDreieck(int n)
	{
		int[][] pascal = new int[n][];

		for (int i = 0; i < pascal.length; i++)
		{
			pascal[i] = new int[i + 1];
			for (int h = 0; h < pascal[i].length; h++)
			{

				if (h != 0 && i != h)
					pascal[i][h] = pascal[i - 1][h - 1] + pascal[i - 1][h];

				pascal[i][i] = 1;
				pascal[i][0] = 1;
			}
		}

		for (int j = 0; j < pascal.length; j++)
		{
			for (int k = 0; k < pascal[j].length; k++)
				System.out.print(pascal[j][k] + " ");
			System.out.println();
		}
	}

	public static int quersumme(int z)
	{
		int erg = 0;
		while (z > 0)
		{
			erg += z % 10;
			z /= 10;
		}

		return erg;
	}

	public static int nUeberK(int n, int k)
	{
		int nFak = 1;
		int kFak = 1;
		int nMinKFak = 1;

		for (int i = n; i > 0; i--)
			nFak *= i;

		for (int i = k; i > 0; i--)
			kFak *= i;

		for (int i = n - k; i > 0; i--)
			nMinKFak *= i;

		return nFak / (kFak * nMinKFak);
	}
}
