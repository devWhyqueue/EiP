
public class DozentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dozent derDozent;
		derDozent = new Dozent("Max Muster", "Soziologie", 'm');
		
		Dozent dieDekanin = new Dozent ("Maja Muster", "Informatik", 'w');
		dieDekanin.setDekan(true);
		
		System.out.println(dieDekanin.getName());
		System.out.println(dieDekanin.getGeschlecht());
		System.out.println(dieDekanin.getLehrgebiet());
		System.out.println("Ist Dozentin eine Dekanin?: " + dieDekanin.isDekan());
		
		derDozent.setLehrgebiet("Physik");
	}

}
