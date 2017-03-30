
public class Merge {

	public static void main(String[] args) {
		int[] a = { 5, 9, 11, 19, 21, 30, 156 };
		int[] b = { 1, 8, 14, 16, 144, 180 };

		int[] aUndB = merge1(a, b);
		// bubbleSort(aUndB);

		for (int i = 0; i < aUndB.length; i++)
			System.out.println(aUndB[i]);

	}

	public static int[] merge(int[] a, int[] b) {
		int[] mField = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++)
			mField[i] = a[i];

		for (int i = 0; i < b.length; i++)
			mField[i + a.length] = b[i];

		return mField;

	}

	public static void bubbleSort(int[] zahlen) {
		int merker;
		// Mehrere Durchläufe nötig, um alle Zahlen zu sortieren
		for (int j = 0; j < zahlen.length - 1; j++) {
			// 1 Durchlauf mit Tausch von Wertepaaren
			// In einem Durchlauf wird nächstgrößte Zahl nach // hinten gebracht
			for (int i = 0; i < zahlen.length - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					merker = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = merker;
				}
			}
		}
	}

	public static int[] merge1(int[] a, int[] b) {
		int[] mField = new int[a.length + b.length];

		int aPos = 0;
		int bPos = 0;
		int mFieldPos = 0;

		while (mFieldPos < mField.length) {

			if (bPos < b.length) {

				while (aPos < a.length && a[aPos] < b[bPos]) {
					mField[mFieldPos] = a[aPos];
					mFieldPos++;
					aPos++;

				}
			} else {
				while (aPos < a.length) {
					mField[mFieldPos] = a[aPos];
					mFieldPos++;
					aPos++;
				}
			}

			if (aPos < a.length) {

				while (bPos < b.length && b[bPos] < a[aPos]) {
					mField[mFieldPos] = b[bPos];
					mFieldPos++;
					bPos++;
				}

			} else {
				while (bPos < b.length) {
					mField[mFieldPos] = b[bPos];
					mFieldPos++;
					bPos++;
				}

			}
		}

		return mField;

	}

}
