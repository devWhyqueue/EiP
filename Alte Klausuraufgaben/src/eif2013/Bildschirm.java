package eif2013;

public class Bildschirm
{
	boolean[][] pixel;

	public Bildschirm(int breite, int hoehe)
	{
		pixel = new boolean[hoehe][breite];
	}

	public void rectangle(int z, int s, int b, int h, boolean zustand)
	{
		assert z >= 0;
		assert s >= 0;
		assert z + h <= pixel.length;
		assert s + b <= pixel[0].length;

		for (int zeile = z; zeile < h; zeile++) {
			for (int spalte = s; spalte < b; spalte++) {
				pixel[zeile][spalte] = zustand;
			}
		}
	}

	public void rectangleTwo(int z, int s, int b, int h)
	{
		assert z >= 0;
		assert s >= 0;
		assert z + h <= pixel.length;
		assert s + b <= pixel[0].length;
		assert b >= 2;
		assert h >= 2;

		rectangle(z, s, b, h, true);
		rectangle(z + 1, s + 1, b - 1, h - 1, false);
	}

	public void bildschirmAusgeben()
	{
		for (int zeile = 0; zeile < pixel.length; zeile++) {
			for (int spalte = 0; spalte < pixel[zeile].length; spalte++) {
				if (!pixel[zeile][spalte])
					System.out.print("f ");
				else
					System.out.print("t ");
			}
			System.out.println();
		}
	}

}
