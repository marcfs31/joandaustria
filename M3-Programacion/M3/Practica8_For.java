import java.io.*;

/**
 * Exercici2. Nom repetit x vegades
 **/
/*public class Practica8_For{
	
	public static void main (String args[]) throws IOException {
		int voltes, i;
		String nom, inputVoltes;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introudeix el teu nom: ");
		nom = r.readLine();
		System.out.print("Introeix el numero de cops que els vols repetir(major que 0): ");
		inputVoltes = r.readLine();
		voltes = Integer.parseInt(inputVoltes);
		for (i=0; i<voltes; i++){
			System.out.println(nom);
		}
	}
}*/

/**
 * Exercici4. Es fara la suma de tots els números entre l’introduït i el 1
 **/
/*public class Practica8_For{
	
	public static void main (String args[]) throws IOException {
		int suma, num;
		String inputNum;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Es fara la suma de tots els números entre l’introduït i el 1");
		System.out.print("Introdueix el numero: ");
		inputNum = r.readLine();
		num = Integer.parseInt(inputNum);
		suma = 0;
		num++;
		for(int i=1; i < num; i++){
			suma = suma + i;
			if (i == num-1){
				System.out.println(i);
			}
			else{
				System.out.print(i+"+");
			}
		}
		System.out.println(suma);
	}
}*/

/**
 * Exercici5.
 **/
/*public class Practica8_For{

	public static void main (String args[]) throws IOException {
		String nom, inputEdat, inputAny;
		int edat, any;
		boolean validacio = true;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escriu el teu nom: ");
		nom = r.readLine();
		System.out.print("Escriu la teva edat: ");
		inputEdat = r.readLine();
		edat = Integer.parseInt(inputEdat);
		System.out.print("Quin any es: ");
		inputAny = r.readLine();
		any = Integer.parseInt(inputAny);
		System.out.println ("");
		
		while (validacio){
			if (nom == ""){
				System.out.print("Escriu el teu nom: ");
				nom = r.readLine();
			}
			else if (edat < 0){
				System.out.print("Escriu la teva edat: ");
				inputEdat = r.readLine();
				edat = Integer.parseInt(inputEdat);
			}
			else if (any < edat){
				System.out.print("Quin any es: ");
				inputAny = r.readLine();
				any = Integer.parseInt(inputAny);
			}
			else{
				validacio=false;
			}
		}
		System.out.println("");
		
		for (int i = 1; i < edat; i++){
			if (i == 1){
				System.out.println("Al "+(any - edat)+" va neixer");
			}
			else{
				System.out.println("Al "+(any - (edat - i))+" tenia "+i+" anys");
			}
		}
	
		System.out.println("Adeu "+nom);
	}
}*/
/**
 * Exercici 7: Nota Mitjana I
 **/
/*public class Practica8_For{

	public static void main (String args[]) throws IOException {
		float Nota, pitjorNota, mitja;
		String Alumne, inputNota, pitjorAlumne;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorNota=10;
		mitja = 0;
		pitjorAlumne="";
		for (int i = 0; i < 10; i++){
			System.out.print("Nom del alumne: ");
			Alumne = r.readLine();
			System.out.print("Nota: ");
			inputNota = r.readLine();
			Nota = Integer.parseInt(inputNota);
			mitja += Nota;
			if (Nota < pitjorNota){
				pitjorNota = Nota;
				pitjorAlumne = Alumne;
			}
		}
		mitja = mitja / 10;
		System.out.println("La mitja es de "+mitja);
		System.out.println("El pijor alumne es "+pitjorAlumne+" amb un "+pitjorNota);
	}
}*/

/**
 * Exercici 8: Nota Mitjana
 **/
/*public class Practica8_For{

	public static void main (String args[]) throws IOException {
		float Nota, pitjorNota, mitja, i;
		String Alumne, inputNota, pitjorAlumne, sortir;
		boolean  validacio = true;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		pitjorNota=10;
		mitja = 0;
		pitjorAlumne="";
		i=0;
		while (validacio){
			i+=1;
			System.out.print("Nom del alumne: ");
			Alumne = r.readLine();
			System.out.print("Nota: ");
			inputNota = r.readLine();
			Nota = Integer.parseInt(inputNota);
			mitja += Nota;
			if (Nota < pitjorNota){
				pitjorNota = Nota;
				pitjorAlumne = Alumne;
			}
			System.out.println("Desitja finalitzar (S/N)?");
			sortir = r.readLine();
			if (sortir.equals("s") || sortir.equals("S") || sortir.equals("si") || sortir.equals("Si") || sortir.equals("SI")){
				validacio = false;
			}
		}
		mitja = mitja / i;
		System.out.println("\nLa mitja es de "+mitja);
		System.out.println("El pijor alumne es "+pitjorAlumne+" amb un "+pitjorNota);
	}
}*/

/**
 * Exercici 11. Un triangle d'asteriscs
 **/
/*public class Practica8_For{

	public static void main (String args[]) throws IOException {
		int num, n, i;
		String inputNum;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escriut un numero enter positiu: ");
		inputNum = r.readLine();
		num = Integer.parseInt(inputNum);
		num++;
		for (n = 1; n < num; n++){
			for (i = 1; i < n; i++){
				if (i == n - 1){
					System.out.println("*");
				}
				else{
					System.out.print("*");
				}
			}
		}
	}
}*/

/**
 * Exercici 11. Un triangle de nombres
 **/
/*public class Practica8_For{

	public static void main (String args[]) throws IOException {
		int num, n, i;
		String inputNum;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escriut un numero enter positiu: ");
		inputNum = r.readLine();
		num = Integer.parseInt(inputNum);
		for (n = 1; n < num + 1; n++){
			for (i = n; i > 0; i--){
				if (i ==  1){
					System.out.println(i);
				}
				else{
					System.out.print(i+", ");
				}
			}
		}
	}
}*/

/**
 * Exercici 11. Un triangle de nombres
 **/
/*public class Practica8_For{

	public static void main (String args[]) throws IOException {
		int num, n, i;
		String inputNum;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escriut un numero enter positiu: ");
		inputNum = r.readLine();
		num = Integer.parseInt(inputNum);
		for (n = num; n > 0; n--){
			for (i = n; i > 0; i--){
				if (i ==  1){
					System.out.println(i);
				}
				else{
					System.out.print(i+", ");
				}
			}
		}
	}
}*/

/**
 * Exercici 15. Rombos
 **/
public class Practica8_For{

	public static void main (String args[]) throws IOException {
		int n, i, x;
		String inputNum;
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		x=9;
		for (n = 0; n < 10; n++){
			for (i = 0; i < x; i++){
				System.out.print("·");
			}
			for (i = x; i < 9; i++){
				System.out.print(i);
			}
			System.out.print(9);
			for (i = 8; i > x - 1; i--){
				System.out.print(i);
			}
			for (i = 0; i < x; i++){
				System.out.print("·");
			}
		x--;
		System.out.println();
		}
		x=1;
		for (n = 9; n > 0; n--){
			for (i = 0; i < x; i++){
				System.out.print("·");
			}
			for (i = x; i < 9; i++){
				System.out.print(i);
			}
			System.out.print(9);
			for (i = 8; i > x - 1; i--){
				System.out.print(i);
			}
			for (i = 0; i < x; i++){
				System.out.print("·");
			}
		x++;
		System.out.println();
		}
	}
}
