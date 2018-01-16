import java.io.*;
/**
 * Exercici 1: Inicialització de matriu
 **/
/*public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int matriu[][] = new int [FIL][COL];
		for (int i = 0; i < FIL; i++){
			for (int a = 0; a < COL; a++){
				matriu[i][a] = 1;
				System.out.print(matriu[i][a]+"  ");
			}
			System.out.println();
		}
	}
}*/

/**
 * Exercici 2: Inicialització seqüencial
 **/
/*public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int cont = 1;
		int matriu[][] = new int [FIL][COL];
		for (int i = 0; i < FIL; i++){
			for (int a = 0; a < COL; a++){
				matriu[i][a] = cont;
				cont++;
				System.out.print(matriu[i][a]+"  ");
			}
			System.out.println();
		}
	}
}*/


/**
 * Exercici 3: Diagonal \
 **/
 
/*
public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int matriu[][] = new int [FIL][COL];
		for (int i = 0; i < FIL; i++){
			if (i + 1 != FIL){
			matriu[i][i] = 1;	
			}
			for (int a = 0; a < COL; a++){
				System.out.print(matriu[i][a]+"  ");
			}
			System.out.println();
		}
	}
}
*/

/**
 * Exercici 4: Pas de vianants horitzontal
 **/
/*public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int matriu[][] = new int [FIL][COL];
		for (int i = 1; i < FIL; i += 2){
			for (int a = 0; a < COL; a++){
				matriu[i][a] = 1;
			}
		}
		
		for (int i = 0; i < FIL; i++){
			for (int a = 0; a < COL; a++){
				System.out.print(matriu[i][a]+"  ");
			}
			System.out.println();
		}
	}
}*/

/**
 * Exercici 5: Pas de vianants vertical
 **/
/*public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int matriu[][] = new int [FIL][COL];
		for (int i = 1; i < COL; i += 2){
			for (int a = 0; a < FIL; a++){
				matriu[a][i] = 1;
			}
		}
		
		for (int i = 0; i < FIL; i++){
			for (int a = 0; a < COL; a++){
				System.out.print(matriu[i][a]+"  ");
			}
			System.out.println();
		}
	}
}*/

/**
 * Exercici 6: Pas encreuat
 **/
/*public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int matriu1[][] = new int [FIL][COL];
		int matriu2[][] = new int [FIL][COL];
		int matriu3[][] = new int [FIL][COL];
		for (int i = 1; i < FIL; i += 2){
			for (int a = 0; a < COL; a++){
				matriu1[i][a] = 1;
			}
		}
		for (int i = 1; i < COL; i += 2){
			for (int a = 0; a < FIL; a++){
				matriu2[a][i] = 1;
			}
		}
		for (int i = 0; i < FIL; i += 1){
			for (int a = 0; a < COL; a++){
				matriu3[i][a] = matriu1[i][a] + matriu2[i][a];
				System.out.print(matriu3[i][a]+"  ");
			}
			System.out.println();
		}
	}
}*/

/**
 * Exercici 7: Diagonal /
 **/
/*public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int n = 0;
		int matriu[][] = new int [FIL][COL];
		for (int i = FIL-1; i >= 0; i--){
			if (i != (FIL - 1)){
			matriu[i][n] = 1;
			n++;
			}
		}
		for (int i = 0; i < FIL; i += 1){
			for (int a = 0; a < COL; a++){
				System.out.print(matriu[i][a]+"  ");
			}
			System.out.println();
		}
	}
}*/

/**
 * Exercici 8: Capçaleres
 **/
public class Practica10_Array_2 {
	public static void main (String args[]) {
		final int COL = 4;
		final int FIL = 5;
		int n = 0;
		int matriu[][] = new int [FIL][COL];
		for (int i = FIL-1; i >= 0; i--){
			if (i != (FIL - 1)){
			matriu[i][n] = 1;
			n++;
			}
		}
		for (int i = -1; i < FIL; i += 1){
			for (int a = -1; a < COL; a++){
				if (i == -1){
					if (a == -1){
						System.out.print("     ");
					}
					else{
						System.out.print("["+a+"] ");
					}
				}
				else if (a == -1){
					System.out.print("["+i+"]   ");
				}
				else{
					System.out.print(matriu[i][a]+"   ");
				}
			}
			System.out.println();
		}
	}
}

/**
 * Exercici 9: Totals
 **/
/*public class Practica10_Array_2 {
	public static void main (String args[]) throws IOException {
		final int COL = 5;
		final int FIL = 6;
		String input;
		int n;
		int matriu[][] = new int [FIL][COL];
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		input = r.readLine();
		n = Integer.parseInt(input);
		for (int i = 0; i < FIL - 1; i++){
			for (int a = 0; a < COL - 1; a++){
			matriu[i][a] = n;
			matriu[i][4] += matriu[i][a];
			n++;
			}
		}
		for (int i = 0; i < FIL - 1; i++){
			for (int a = 0; a < COL - 1; a++){
				matriu[5][a] += matriu[i][a];
				if (a + 1 == COL - 1){
					matriu[5][a + 1] += matriu[i][a + 1];
				}
			}
		}
		for (int i = -1; i < FIL; i++){
			for (int a = -1; a < COL; a++){
				if (i == -1){
					if (a == -1){
						System.out.print("     ");
					}
					else{
						System.out.print("["+a+"]  ");
					}
				}
				else if (a == -1){
					System.out.print("["+i+"]  ");
				}
				else if (matriu[i][a] > 9){
					System.out.print(matriu[i][a]+"   ");
				}
				else{
					System.out.print(matriu[i][a]+"    ");
				}
			}
			System.out.println();
		}
	}
}*/

