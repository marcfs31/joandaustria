/*
 * Validació per transformar un String a un altre tipus
 * 
 * Per fer servir aquesta funcio es rcomenable ferla juntament amb un 'wile' o 'do while'
 * ja que retorna 'true' en cas de que es de que no hi hagi problemes i 'false' en el
 * cas contrari.
 */
public class CheckString {
	
	/*
	 * Validacio dels 'String' per a la conversio a tipus 'numeric'
	 */
	public static boolean toNum(String string) {
		// Enmagatzema tots els caracters que vols que retorni com a error.
		char notNum[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','ç',
					'ñ',',',';','\'',':','-','_','?','¿','¡','!','"','@','·','#','$','~','%','½','&','¬','/','{','}','(',')',
					'\\','ª','º','|','=','[',']','`','^','+','*','´','¨'};
		string = string.toLowerCase();
		int count = 0;
		if (string.isEmpty()) { // Si el l'String es vuit
			System.out.println("No has introduit cap valor.");
			count++;
		} else { // Si te caracters
			int la = notNum.length; // Calcula el llarg de la llista
			int li = string.length(); // Calcula el llarg de l'String
			for (int i = 0; i < li; i++) {
				for (int j = 0; j < la; j++) {
					if (notNum[j] == (string.charAt(i))) { // Si coincideix un caracter de l'String amb un de la llista
						if (count == 0) {
							System.out.print("Has introduit un caracter no numeric\nEs/Son: "+notNum[j]+" ");
							count++;
						} else {
							System.out.print(notNum[j]+" ");
							count++;
						}
					}
				}
			}
			System.out.println();
		}
		// Si el contador a augmentat el seu valor voldra dir que no es pot convertir a un numero i retornara 'false'
		boolean resultat = count == 0;
		return resultat;
	}
	
	/*
	 * Validacio dels 'String' per a la conversio a tipus 'caracter unic'
	 */
	public static boolean toChar(String string) {
		if (string.length() == 1) { // Si l'String conte un unic caracter
			return(true);
		} else { // En cas contrari
			System.out.println("Hi ha més d'un caracter.");
			return(false);
		}
	}
}
