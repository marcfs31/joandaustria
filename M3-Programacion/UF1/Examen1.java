import java.io.*;
public class Examen1 {
	
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//Variables
		String num1_str,num2_str;
		int num1,num2,suma,i;
		suma =0;
		
		//Coger los números
		System.out.print("Introdueix el primer numero: ");
		num1_str = reader.readLine();
		num1 = Integer.parseInt(num1_str);
		System.out.print("Introdueix el segon numero: ");
		num2_str = reader.readLine();
		num2 = Integer.parseInt(num2_str);
		
		if(num2<num1){ //Validar que el segundo numero no sea menor al primero
			System.out.print("El primer numero no pot esser inferior al primer");
		}else{
			for(i=num1;i<=num2;i++){ //Sumar
				suma = suma + i;
			}
			System.out.println("La suma del rang és: "+suma);
		}
	}
}

