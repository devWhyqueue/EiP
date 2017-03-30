
public class BruchTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bruch ersterBruch = new Bruch(-10, 5);
		Bruch zweiterBruch = new Bruch(4);
		
		ersterBruch.kuerzen();
		System.out.println(ersterBruch);
		
		ersterBruch.multipliziere(zweiterBruch);
		System.out.println(ersterBruch);
		
		ersterBruch.multipliziere(2);
		System.out.println(ersterBruch);
		
		ersterBruch.dividiere(ersterBruch);
		System.out.println(ersterBruch);
	}

}
