class Hello {
	public static void main (String[] args)
	{
		System.out.println("Hello World!");
		// Zeichenketten
		// System.out.println("Hello World");" Anführungszeichen hinter dem Semikolon sind nicht zulässig
		System.out.print("Hello"); // Gibt Hello aus, aber beendet nicht die Zeile
		System.out.println(" World"); // Gibt World aus und beendet die Zeile
		System.out.println("4*5"); // Gibt den String 4*5 aus ohne eine Rechenoperation auszuführen
		System.out.println(4*5); // Rechnet 4*5 und gibt das Ergebnis aus
		System.out.println("Dies ist" + "ein Text"); // Konkateniert die Strings "Dies ist" und "ein Text" direkt hintereinander
		System.out.println("Dies ist"
		+ "ein Text"); // Das gleiche wie oben, nur in zwei Zeilen
		System.out.println("Dies ist ein \nText" ); // Testausgabe mit neuer Zeile vor Text durch \n
		// Zeichen
		System.out.println("\u0065"); // Ausgabe eines Unicode e
	//	 System.out.println(""");" Anführungszeichen nach Semikolon, Anführungszeichen im String ohne \, daher keine korrekte Darstellung
		System.out.println("\""); // Ausgabe eines Anführungszeichens durch \", um falsche Interpretation zu verhindern;
		// Ganze Zahlen
		System.out.println(2147483647); // Ausgabe der höchstmöglichen Zahl
		System.out.println(2147483647+1); // Ausführung der Rechenoperation und Ausgabe des Ergebnisses. Negative Zahl aufgrund des Überlaufes und des Übertrages der 1 nach vorn.
		System.out.println(0xFF); // Hexadezimalzahl, Ausgabe in Dezimalzahl
		System.out.println(0xFFFF); // "
		System.out.println(0xFFFFFF); // "
		System.out.println(0xFFFFFFFF); // "
		//System.out.println(0xFG);  keine zulässige Hexadezimalzahl (kein G)
		// Gleitpunktzahlen
		System.out.println("Zahl " + 0.344e-17f ); // Zusammenfügung eines Textstrings und einer Zahl in Gleitkommaschreibweise
	    // System.out.println("Zahl " + 0,344e-17f ); Komma statt Punkt (hat nach Komma Parameter des Typs String erwartet, ist aber nicht möglich)
		System.out.println("Zahl " + 0.12345678901234567890); // andere Art der Gleitkommadarstellung, Rundung auf 18 Nackommastellen
		System.out.println("Zahl " + 0.12345678901234567890f); // Darstellung als Float, daher geringe Anzahl von Nachkommastellen, rundet auf 8. Nachkommastelle
		System.out.println("Summe " + (5.6 + 5.8) ); // Summe aus beiden Gleitkommazahlen
		System.out.println("Summe " + (12345678.0f + 0.1f) ); // Aufgrund der Normalisierung wird die 0.1 absorbiert
		System.out.println("Differenz " + (0.123456789f - 0.123456788f) ); // Aufgrund der Normalisierung löschen sich wichtige Stellen aus
		System.out.println("Summe " + ((12345678.0f + 0.1f) + 0.41f) ); // zuerst Absorption, dann nochmal Absporption, daher keine Veränderung
		System.out.println("Summe " + (12345678.0f + (0.1f + 0.41f)) ); // zuerst Addition ähnlich großer Zahlen (=0,5), dann Addition und Aufrundung, Unterschied aufgrund des Assoziativgesetzes
	}
	
}