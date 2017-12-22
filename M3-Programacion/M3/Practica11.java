import java.io.*;

/**
 * Exercici 1: Cerca un caràcter
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introdueix un text breu: ");
		String text = r.readLine();
		System.out.print("Introdueix una lletra per buscarla al text: ");
		char lletra = r.readLine().charAt(0);
		int num = text.indexOf(lletra);
		if (num == -1) {
			System.out.println("El caràcter '" + lletra + "' no apareix a \"" + text + "\"");
		} else {
			System.out.println("El caràcter '" + lletra + "' apareix a \"" + text + "\"");
		}
	}
}*/

/**
 * Exercici 2: Nom en majúscules
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introdueix un text breu: ");
		String text = r.readLine();
		text = text.toUpperCase();
		System.out.print(text);
	}
}*/

/**
 * Exercici 3: El nombre de A's
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introdueix el teu nom: ");
		String text = r.readLine();
		int num = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'a') {
				num += 1;
			}
		}
		System.out.print("El nom conté " + num + " 'a's");
	}
}*/

/**
 * Exercici 4: Anàlisi del nom
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introdueix el teu nom: ");
		String nom = r.readLine().toLowerCase();
		int length = nom.length();
		int vocals = 0;
		for (int i = 0; i < length; i++) {
			if (nom.charAt(i) == 'a' || nom.charAt(i) == 'o' || nom.charAt(i) == 'i' || nom.charAt(i) == 'e' || nom.charAt(i) == 'u') {
				vocals++;
			}
		}
		System.out.println(length + " càracters i " + vocals + " vocals");
	}
}*/

/**
 * Exercici 5: Inicials en majúscules
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introdueix el teu nom: ");
		String nom = r.readLine().toLowerCase();
		int length = nom.length();
		int vocals = 0;
		for (int i = 0; i < length; i++) {
			if (nom.charAt(i) == 'a' || nom.charAt(i) == 'o' || nom.charAt(i) == 'i' || nom.charAt(i) == 'e' || nom.charAt(i) == 'u') {
				vocals++;
			}
		}
		System.out.println(length + " càracters i " + vocals + " vocals");
	}
}*/

/**
 * Exercici 6: Codi Morse
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introdueix el text per traduir a morde: ");
		String text = r.readLine().toLowerCase();
		String morse = "morse: ";
		char l[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
		String m[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
		for (int i = 0; i < text.length(); i++) {
			for (int n = 0; n < l.length; n++) {
				if (text.charAt(i) == l[n]) {
					morse += m[n] + " ";
					break;
				}
			}
		}
		System.out.println(morse);
	}
}*/

/**
 * Exercici 7: Figures amb strings
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce una paraula: ");
		String paraula = r.readLine();
		String text;
		int l = paraula.length();
		for (int i = l - 1; i > 0; i--) {
			text = "";
			for (int n = i; n < l; n++) {
				text += paraula.charAt(n);
			}
			System.out.println(text);
		}
		for (int i = l; i > 0; i--) {
			text = "";
			for (int n = 0; n < i; n++) {
				text += paraula.charAt(n);
			}
			System.out.println(text);
		}
	}
}*/

/**
 * Exercici 8: La piràmide
 **/
/*public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introdueix una paraula: ");
		String paraula = r.readLine();
		int l = paraula.length();
		for (int i = 1; i < l + 1; i++) {
			String lef = "";
			String rig = "";
			for (int n =0; n < i; n++) {
				if (n + 1 == i) {
					lef += paraula.charAt(n);
					rig = paraula.charAt(n) + rig;
				}
				else{
					lef += paraula.charAt(n) + ",";
					rig = "," + paraula.charAt(n) + rig;
				}
			}
				
			for (int n = 0; n < l - i; n++) {
				lef = ". " + lef;
				rig += " .";
			}
			System.out.println(lef + "=" + rig);
		}
	}
}*/

/**
 * Exercici 9: Cerca d'un string
 **/
public class Practica11 {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("String: ");
		String string = r.readLine();
		System.out.print("Substring: ");
		String substring = r.readLine();
		if (string.equals("")) {
			System.out.println("L'string no conte \"" + substring + '"');
		} else if (substring.equals("")) {
			System.out.println("Esta inclos a cualsevol string no buit");
		} else {
			if (string.indexOf(substring) != -1) {
				System.out.println('"' + substring + "\" es troba a l'string \"" + string + '"');
			} else {
				System.out.println('"' + substring + "\" no i es a l'string \"" + string + '"');
			}
		}
	}
}
