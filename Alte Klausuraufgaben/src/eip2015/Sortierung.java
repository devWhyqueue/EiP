package eip2015;

public class Sortierung
{
	public int[] merge(int[] a, int[] b)
	{
		int[] ausgabe = new int[a.length + b.length];
		int indexA = 0;
		int indexB = 0;

		while (indexA + indexB < a.length + b.length)
		{
			if (indexA < a.length && indexB < b.length)
			{
				if (a[indexA] < b[indexB])
				{
					ausgabe[indexA + indexB] = a[indexA];
					indexA++;
				}
				else
				{
					ausgabe[indexA + indexB] = b[indexB];
					indexB++;
				}
			}
			else if (indexA < a.length)
			{
				ausgabe[indexA + indexB] = a[indexA];
				indexA++;
			}
			else
			{
				ausgabe[indexA + indexB] = b[indexB];
				indexB++;
			}

		}

		return ausgabe;
	}

}
