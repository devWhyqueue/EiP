package eif2013;

public class Struktogramm
{

	public Struktogramm()
	{
		// TODO Auto-generated constructor stub
	}

	public int tuWas(int a, int b)
	{
		int x = a;
		int y = b;
		int z = 0;

		while (x > 0) {
			if (x % 2 != 0)
				z = z + y;
			y = 2 * y;
			x = x / 2;
		}
		return z;
	}
}
