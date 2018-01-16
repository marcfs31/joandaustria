/**
 * Ordena els numeros
 **/ 
import java.io.*;
public class ordenar_nombres {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String inputNum, inputNums;
		int canvi;
		int Num[] = new int [50];
		int nums;
		System.out.print("Quants numeros vols introduir?: ");
		inputNums = r.readLine();
		nums = Integer.parseInt(inputNums);
		while (nums > 50 || nums < 0){
			System.out.print("Introdueix be la cuantitat de notes < 50: ");
			inputNums = r.readLine();
		}
			nums = Integer.parseInt(inputNums);
		for (int i = 0; i < nums; i++){
			System.out.print("Nota: ");
			inputNum = r.readLine();
			Num[i] = Integer.parseInt(inputNum);		
		}
		for (int n = 0; n < nums - 1; n++) {
			for (int i = 0; i < nums - 1; i++){
				if (Num[i] > Num[i+1]){
					canvi = Num[i];
					Num[i] = Num[i+1];
					Num[i+1] = canvi;
				}
			}
		}
		
		for (int i = 0; i < nums; i++){
			System.out.println(Num[i]);
		}
	}
}


