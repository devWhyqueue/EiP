
public class Aufgaben {

	public static void main(String[] args) {
		meinWeihnachtsbaum(30);
		treppe(0);
	}

	private static void treppe(int n) {
		String s = "";

		for (int zeilen = n; zeilen > 0; zeilen--) {
			for (int spalten = 0; spalten < zeilen; spalten++) {
				s = "*" + s;
			}
			s = "\n" + s;
		}
		s = s.trim();
		System.out.println(s);
	}

	private static void meinWeihnachtsbaum(int hoehe) {
		for (int zeile = 1; zeile <= hoehe; zeile++) {
			for (int anzLeer = hoehe - zeile; anzLeer > 0; anzLeer--) {
				System.out.print(" ");
			}
			for (int anzSterne = (2 * zeile) - 1; anzSterne > 0; anzSterne--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
