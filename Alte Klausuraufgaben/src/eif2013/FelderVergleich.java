package eif2013;

public class FelderVergleich {

	public FelderVergleich() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean zweiFelderGleich(char[] eins, char[] zwei){
		boolean inhaltGleich = true;
		
		if(eins.length == zwei.length){
			for(int i = 0; i < eins.length; i++){
				if(eins[i] != zwei[i]){
					inhaltGleich = false;
					break;
				}
			}
		}else
			inhaltGleich = false;
		
		
		return inhaltGleich;
	}

	public boolean zweiFelderUmkehrung(char[] eins, char[] zwei) {
		boolean sameButReversed = true;

		if (eins.length == zwei.length) {
			for (int i = 0; i < eins.length; i++) {
				if (eins[i] != zwei[zwei.length - 1 - i]){
					sameButReversed = false;
					break;
				}
			}
		} else
			sameButReversed = false;
		
		return sameButReversed;
	}
	
	public boolean vergleichen(char[][] test){
		boolean umkehrungExistiert = false;
		
		for(int vergleichsArray = 0; vergleichsArray < test.length; vergleichsArray++){
			for(int i = 0; i < test.length; i++){
				if(vergleichsArray != i && zweiFelderUmkehrung(test[vergleichsArray], test[i])){
					umkehrungExistiert = true;
					break;
				}
			}
		}
		return umkehrungExistiert;
	}
}
