import java.io.*;
/**
 * Exercici 1: Estadístics de notes
 **/
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		float pitjorNota, mitja;
		int alumnes;
		String inputNota, inputAlumnes, pitjorAlumne;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorAlumne = "";
		pitjorNota=10;
		mitja = 0;
		System.out.print("Quants alumnes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0)){
			System.out.print("Introdueix be la cuantitat d'alumes < 50: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		String nom[] = new String [alumnes];
		float nota[] = new float [alumnes];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nom del alumne: ");
			nom[i] = r.readLine();
			System.out.print("Nota: ");
			inputNota = r.readLine();
			nota[i] = Integer.parseInt(inputNota);
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
				pitjorAlumne = nom[i];
			}
		}
		mitja = mitja / alumnes;
		System.out.println("La mitja es de "+mitja);
		System.out.println("El pijor alumne es "+pitjorAlumne+" amb un "+pitjorNota);
	}
}*/

/**
 * Exercici 2: Notes separades per coma
 **/
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		int alumnes;
		String inputNota, inputAlumnes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Quantes notes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0)){
			System.out.print("Introdueix be la cuantitat de notes < 51: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		float nota[] = new float [alumnes];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nota"+i+": ");
			inputNota = r.readLine();
			nota[i] = Integer.parseInt(inputNota);
		}
		for (int i = 0; i < alumnes; i++){
				System.out.print(nota[i]+", ");
		}
	}
}*/

/**
 * Exercici 3: Notes separades per coma ordre invertit
 **/
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		int alumnes;
		String inputNota, inputAlumnes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Quantes notes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0)){
			System.out.print("Introdueix be la cuantitat de notes < 51: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		float nota[] = new float [alumnes];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nota"+i+": ");
			inputNota = r.readLine();
			nota[i] = Integer.parseInt(inputNota);
		}
		alumnes--;
		for (int i = alumnes; i > -1; i--){
				System.out.print(nota[i]+", ");
		}
	}
}*/

/**
 * Exercici 4: Números parells
 **/
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int nums = 0;
		int parells[] = new int [100];
		for (int i = 0; i < 100; i++){
			parells[i] = nums;
			nums += 2;
			System.out.println("["+i+"]: "+parells[i]);
		}
	}
}*/

/**
 * Exercici 5: Corregeix nota
 **/ 
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		float pitjorNota, mitja, millorNota;
		int alumnes, novanota;
		String inputNota, inputAlumnes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		System.out.print("Quantes notes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0){
			System.out.print("Introdueix be la cuantitat de notes < 50: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		float nota[] = new float [alumnes];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nota: ");
			inputNota = r.readLine();
			nota[i] = Integer.parseInt(inputNota);
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		System.out.println();
		for (int i = 0; i < alumnes; i++){
				System.out.println(nota[i]);
		}
		System.out.println();
		mitja = mitja / alumnes;
		System.out.print("Mitja: ");
		System.out.println(mitja);
		System.out.print("Minim: ");
		System.out.println(pitjorNota);
		System.out.print("Màxim: ");
		System.out.println(millorNota);
		
		System.out.print("Quina nota vols canviar(indicau amb un valor del 0 al "+(alumnes - 1)+"): ");
		inputAlumnes = r.readLine();
		novanota = Integer.parseInt(inputAlumnes);
		while (novanota > alumnes - 1 || novanota < 0){
			System.out.print("Introdueix un valor correcte(del 0 al "+(alumnes - 1)+"): ");
			inputAlumnes = r.readLine();
			novanota = Integer.parseInt(inputAlumnes);
		}
		System.out.print("Introdueix la nova nota: ");
		inputNota = r.readLine();
		nota[novanota] = Float.parseFloat(inputNota);
		
		System.out.println();
		for (int i = 0; i < alumnes; i++){
				System.out.print(nota[i]+", ");
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		mitja = mitja / alumnes;
		System.out.println();
		System.out.println("Mitja "+mitja);
		System.out.println("Minim: "+pitjorNota);
		System.out.println("Màxim: "+millorNota);
	}
}*/

/**
 * Exercici 6: Estadístics d'institut.
 **/ 
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		float pitjorNota, mitja, millorNota;
		int alumnes, novanota, suspesos, aprobats;
		String inputNota, inputAlumnes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		suspesos = 0;
		System.out.print("Quantes notes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0){
			System.out.print("Introdueix be la cuantitat de notes < 50: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		float nota[] = new float [alumnes];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nota: ");
			inputNota = r.readLine();
			nota[i] = Integer.parseInt(inputNota);
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
			if (nota[i]<5){
				suspesos += 1;
			}
		}
		System.out.println();
		for (int i = 0; i < alumnes; i++){
				System.out.print(nota[i]+", ");
		}
		System.out.println();
		aprobats = alumnes - suspesos;
		mitja = mitja / alumnes;
		System.out.println("Mitja "+mitja);
		System.out.println("Minim: "+pitjorNota);
		System.out.println("Màxim: "+millorNota);
		System.out.println("Aprobats: "+aprobats);
		System.out.println("Suspesos: "+suspesos);
	}
}*/

/**
 * Exercici 7: Aproba a tothom
 **/ 
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		float pitjorNota, mitja, millorNota;
		int alumnes, novanota;
		String inputNota, inputAlumnes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		System.out.print("Quantes notes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0){
			System.out.print("Introdueix be la cuantitat de notes < 50: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		float nota[] = new float [alumnes];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nota: ");
			inputNota = r.readLine();
			nota[i] = Float.parseFloat(inputNota);
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		System.out.println();
		for (int i = 0; i < alumnes; i++){
				System.out.print(nota[i] + ", ");
		}
		System.out.println();
		mitja = mitja / alumnes;
		System.out.println("Mitja " + mitja);
		System.out.println("Minim: " + pitjorNota);
		System.out.println("Màxim: " + millorNota);
		
		System.out.print("Quina nota vols canviar(indicau amb un valor del 0 al "+(alumnes - 1)+"): ");
		inputAlumnes = r.readLine();
		novanota = Integer.parseInt(inputAlumnes);
		while (novanota > alumnes - 1 || novanota < 0){
			System.out.print("Introdueix un valor correcte(del 0 al "+(alumnes - 1)+"): ");
			inputAlumnes = r.readLine();
			novanota = Integer.parseInt(inputAlumnes);
		}
		System.out.print("Introdueix la nova nota: ");
		inputNota = r.readLine();
		nota[novanota] = Float.parseFloat(inputNota);
		
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		for (int i = 0; i < alumnes; i++){
			if (nota[i] < 5){
				nota[i] = 5;
			}
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		System.out.println();
		for (int i = 0; i < alumnes; i++){
				System.out.print(nota[i]+", ");
		}
		System.out.println();
		mitja = mitja / alumnes;
		System.out.println("Mitja "+mitja);
		System.out.println("Minim: "+pitjorNota);
		System.out.println("Màxim: "+millorNota);
	}
}*/

/**
 * Exercici 8: Inserir una nota
 **/ 
/*public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		float pitjorNota, mitja, millorNota;
		int alumnes, novanota,n;
		String inputNota, inputAlumnes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		System.out.print("Quantes notes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0){
			System.out.print("Introdueix be la cuantitat de notes < 50: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		float nota[] = new float [50];
		float guardat[] = new float [50];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nota: ");
			inputNota = r.readLine();
			nota[i] = Float.parseFloat(inputNota);
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		System.out.println();
		for (int i = 0; i < alumnes; i++){
				System.out.print(nota[i] + ", ");
		}
		System.out.println();
		mitja = mitja / alumnes;
		System.out.println("Mitja " + mitja);
		System.out.println("Minim: " + pitjorNota);
		System.out.println("Màxim: " + millorNota);
		
		System.out.print("A quina posició vols afegir un nota?(indicau amb un valor del 0 al "+(alumnes - 1)+"): ");
		inputAlumnes = r.readLine();
		novanota = Integer.parseInt(inputAlumnes);
		while (novanota > alumnes - 1 || novanota < 0){
			System.out.print("Introdueix un valor correcte(del 0 al "+(alumnes - 1)+"): ");
			inputAlumnes = r.readLine();
			novanota = Integer.parseInt(inputAlumnes);
		}
		System.out.print("Introdueix la nova nota: ");
		inputNota = r.readLine();
		n = 0;
		for (int i = novanota; i <= alumnes; i++){
			guardat[n] = nota[i];
			
			n++;
		}
		n = 0;
		for (int i = novanota; i <= alumnes; i++){
			nota[i+1] = guardat[n];
			n++;
		}
		nota[novanota] = Float.parseFloat(inputNota);
		
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		for (int i = 0; i <= alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		System.out.println();
		for (int i = 0; i <= alumnes; i++){
				System.out.print(nota[i]+", ");
		}
		System.out.println();
		mitja = mitja / alumnes;
		System.out.println("Mitja "+mitja);
		System.out.println("Minim: "+pitjorNota);
		System.out.println("Màxim: "+millorNota);
	}
}*/

/**
 * Exercici 9: Eliminar una nota
 **/ 
public class Practica10_Array {

	public static void main (String args[]) throws IOException {
		float pitjorNota, mitja, millorNota;
		int alumnes, delnota, n;
		String inputNota, inputAlumnes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		System.out.print("Quantes notes introudiras?: ");
		inputAlumnes = r.readLine();
		alumnes = Integer.parseInt(inputAlumnes);
		while (alumnes > 50 || alumnes < 0){
			System.out.print("Introdueix be la cuantitat de notes < 50: ");
			inputAlumnes = r.readLine();
			alumnes = Integer.parseInt(inputAlumnes);
		}
		float nota[] = new float [50];
		float guardat[] = new float [50];
		for (int i = 0; i < alumnes; i++){
			System.out.print("Nota: ");
			inputNota = r.readLine();
			nota[i] = Float.parseFloat(inputNota);
		}
		for (int i = 0; i < alumnes; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		System.out.println();
		for (int i = 0; i < alumnes; i++){
				System.out.print(nota[i] + ", ");
		}
		System.out.println();
		mitja = mitja / alumnes;
		System.out.println("Mitja " + mitja);
		System.out.println("Minim: " + pitjorNota);
		System.out.println("Màxim: " + millorNota);
		
		System.out.print("A quina posició vols afegir un nota?(indicau amb un valor del 0 al "+(alumnes - 1)+"): ");
		inputAlumnes = r.readLine();
		delnota = Integer.parseInt(inputAlumnes);
		while (delnota > alumnes - 1 || delnota < 0){
			System.out.print("Introdueix un valor correcte(del 0 al "+(alumnes - 1)+"): ");
			inputAlumnes = r.readLine();
			delnota = Integer.parseInt(inputAlumnes);
		}
		n = 0;
		for (int i = delnota + 1; i < alumnes; i++){
			guardat[n] = nota[i];
			
			n++;
		}
		n = 0;
		for (int i = delnota; i < alumnes - 1; i++){
			nota[i] = guardat[n];
			n++;
		}
		
		pitjorNota = 10;
		millorNota = 0;
		mitja = 0;
		for (int i = 0; i < alumnes - 1; i++){
			mitja += nota[i];
			if (nota[i] < pitjorNota){
				pitjorNota = nota[i];
			}
			if (nota[i] > millorNota){
				millorNota = nota[i];
			}
		}
		System.out.println();
		for (int i = 0; i < alumnes - 1; i++){
				System.out.print(nota[i]+", ");
		}
		System.out.println();
		mitja = mitja / alumnes;
		System.out.println("Mitja "+mitja);
		System.out.println("Minim: "+pitjorNota);
		System.out.println("Màxim: "+millorNota);
	}
}
