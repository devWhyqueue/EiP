package eip2014;

public class StringCount
{
	private int[] anzBuchstaben;

	public void zaehleZeichen(String str, char[] c)
	{

		anzBuchstaben = new int[c.length];

		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < str.length(); j++)
			{
				if (c[i] == str.charAt(j))
				{
					anzBuchstaben[i]++;
				}
			}
		}
	}

	public void ausgeben()
	{
		for (int i = 0; i < anzBuchstaben.length; i++)
		{
			System.out.print(anzBuchstaben[i] + " ");
		}
	}

}
