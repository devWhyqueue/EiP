import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	static String lang[];
	static String potenzsprache[];
	static String potenzsprache2[];
	static int maechtigkeit;
	static int exponent;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		definiereSprache();
		berechneMaechtigkeit();
		kopiereElemente();
		fuegeVornAn(); // berechne L^2
		if(exponent>2){
		while(exponent>2){
			berechneMaechtigkeit2();
			kopierePotenzsprache();
			fuegeVornAn2();
			potenzsprache = potenzsprache2;
			exponent -= 1;
		}
		gebeAus(filter(potenzsprache2));
		}else{
			gebeAus(filter(potenzsprache));
		}
	}
	
	static Object[] filter(String[] ps){
		Set set = new HashSet();
		for (int i = 0; i < ps.length; ++i)
		{
		    set.add(ps[i]);
		}
		Object[] cleanArray = set.toArray();
		
		return cleanArray;
	}
	
	 static void definiereSprache() throws IOException{
	   InputStreamReader isr = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader(isr);
	   System.out.print("Gib die Anzahl der Elemente ein: ");
	   String eingabe = br.readLine();
	   int laenge = Integer.parseInt(eingabe);
	   lang = new String[laenge];
	   maechtigkeit = laenge;
	   
	   for(int x=0;x<lang.length;x++){
	   InputStreamReader isr2 = new InputStreamReader(System.in);
	   BufferedReader br2 = new BufferedReader(isr);
	   System.out.print("Gib das nächste Element ein: ");
	   lang [x] = br.readLine();
	   }
	   
	   InputStreamReader isr3 = new InputStreamReader(System.in);
	   BufferedReader br3 = new BufferedReader(isr);
	   System.out.print("Gebe den gewünschten Exponenten der Potenzsprache ein: ");
	   String eingabe3 = br.readLine();
	   exponent = Integer.parseInt(eingabe3);
	}
	
	static void berechneMaechtigkeit(){
		maechtigkeit *= lang.length;
		potenzsprache = new String[maechtigkeit];
	}
	
	static void berechneMaechtigkeit2(){
		maechtigkeit *= lang.length;
		potenzsprache2 = new String[maechtigkeit];
	}
	
	static void kopiereElemente() {
		int y = 0;
		
		for(int x=0;x<potenzsprache.length;x++){
		  if(y<lang.length){
		    potenzsprache[x] = lang[y];
		  }else{
			  y=0;
			  potenzsprache[x] = lang[y];
		    }
		  y++;
		  } 
		
	}
	
	static void kopierePotenzsprache() {
		int y = 0;
		
		for(int x=0;x<potenzsprache2.length;x++){
		  if(y<potenzsprache.length){
		    potenzsprache2[x] = potenzsprache[y];
		  }else{
			  y=0;
			  potenzsprache2[x] = potenzsprache[y];
		    }
		  y++;
		  } 
		
	}
	
	static void fuegeVornAn(){
		int y=0;
		for(int x=0;x<potenzsprache.length;x++){
			potenzsprache[x] = lang[y] + potenzsprache[x];
			if((x+1)%lang.length==0){
				y++;
			}
		}
	}
	
	static void fuegeVornAn2(){
		int y=0;
		for(int x=0;x<potenzsprache2.length;x++){
			potenzsprache2[x] = lang[y] + potenzsprache2[x];
			if((x+1)%potenzsprache.length==0){
				y++;
			}
		}
	}
	
	static void gebeAus(Object[] psFilt){
		for(int i=0; i<psFilt.length; i++) {
			System.out.println(psFilt[i]);
		}	
		System.out.println("Die Mächtigkeit der Menge beträgt: " + psFilt.length);
	}
}
