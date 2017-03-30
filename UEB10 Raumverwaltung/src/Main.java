
public class Main {

	public static void main(String[] args) {
		Raum lenzesRaum = new Raum('B', '2', 28);
		Professor lenze = new Professor("Lenze", lenzesRaum);
		lenzesRaum.setInhaber(lenze);
		
		Raum starksRaum = new Raum('A', 'E', 24);	
		Professor stark = new Professor("Stark", starksRaum);
		starksRaum.setInhaber(stark);
		
		System.out.println("Die ist die Etage des Büros von Professor Lenze: " + lenze.getBuero().getEtage());
		System.out.println("Die ist der Inhaber des Raums: " + starksRaum.getInhaber().getName());
				
	}

}
