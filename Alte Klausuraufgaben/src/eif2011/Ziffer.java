package eif2011;

public class Ziffer
{

	public Ziffer()
	{
		// TODO Auto-generated constructor stub
	}

	public int summeDerZiffernquadrate(int n)
	{
		int sum = 0;

		while (n > 0) {
			sum += (n % 10) * (n % 10);
			n /= 10;
		}

		return sum;
	}

	public boolean istFroehlicheZahl(int n)
	{
		int sum = summeDerZiffernquadrate(n);
		boolean isFroehlich = true;

		while (sum != 4 && sum != 1) {
			sum = summeDerZiffernquadrate(sum);
		}
		if (sum == 4)
			isFroehlich = false;

		return isFroehlich;

	}

}
