import java.io.*;
public class Exercici3 {
	public static void main (String args[]) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String frase;
		int espacios=0;
		
		System.out.print("Introdueix una frase: ");
		frase= reader.readLine();
		
		String frase2 = frase.replaceAll(" ", ""); //Reemplaza los espacios por nada
		
		for(int i=0;i<frase.length();i++){
			if((""+frase.charAt(i)).equals(" ")){ //Si el caracter es un espacio entra al if y cuenta +1 a los espacios
				espacios++;
			}
		}
		System.out.println("Frase compactada: "+frase2);
		System.out.print("Espais eliminats "+espacios+" de "+frase.length()+" caràcters totals");
	}
}

