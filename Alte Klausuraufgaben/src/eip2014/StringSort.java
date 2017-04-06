package eip2014;

public class StringSort
{

	public StringSort()
	{
		// TODO Auto-generated constructor stub
	}

	public String sortiereZeichen(String str)
	{
		String sortiert = "";
		int laenge = str.length();
		char kleinsterBuchstabe = 10000;
		int pos = 0;

		for (int iterations = 0; iterations < laenge; iterations++)
		{
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) < kleinsterBuchstabe && str.length() > 0)
				{
					kleinsterBuchstabe = str.charAt(i);
					pos = i;
				}
			}
			sortiert += kleinsterBuchstabe;
			str = str.substring(0, pos) + str.substring(pos + 1, str.length());
			kleinsterBuchstabe = 10000;

		}
		return sortiert;
	}

}
