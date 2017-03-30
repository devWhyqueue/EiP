public class Stern {
	char[][] feld;

	public Stern(int n) {
		if (n < 5)
			feld = new char[5][5];
		else {
			if (n % 2 != 0)
				feld = new char[n][n];
			else
				feld = new char[n + 1][n + 1];
		}
	}

	public void erzeugeSternMuster() {
		for (int zeilen = 0; zeilen < feld.length; zeilen++) {
			for (int spalten = 0; spalten < feld[zeilen].length; spalten++) {
				if (zeilen == spalten || zeilen == feld.length / 2 || spalten == feld.length / 2 || zeilen + spalten == feld.length - 1) {
					feld[zeilen][spalten] = '*';
				}
			}
		}
	}

	public void ausgeben() {
		for (int zeilen = 0; zeilen < feld.length; zeilen++) {
			for (int spalten = 0; spalten < feld[zeilen].length; spalten++) {
					System.out.print(feld[zeilen][spalten]);
					System.out.print(" ");
				}
			System.out.print("\n");
			}
		}
}