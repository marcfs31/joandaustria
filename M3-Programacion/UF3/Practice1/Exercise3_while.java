import java.io.*;
import java.util.*;
 
public class Exercise3_while {
	
	public static void main (String[] args) throws IOException {
		int num1,num2,num3,intentos;
		String salir;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("JUEGO DE LA RULETA");

		Random num = new Random();
		
		num1 = num.nextInt(10);
		num2 = num.nextInt(10);
		num3 = num.nextInt(10);
		
		intentos = num.nextInt(5);
		
		do {
			try {
				if(intentos <=0){
					salir ="s";
				}
				System.out.println("Intentos restantes"+intentos);
				
				System.out.println("Quieres cambiar alguna posición? ");
				System.out.println("1|2|3 o 0 para ninguna posición");
				String fila= reader.readLine();
				
				if(intentos > 0){
					salir ="n";
					System.out.println("#######");
					System.out.println("#"+num1+"|"+num2+"|"+num3+"#");
					System.out.println("#######");
					
					if(fila.equals("1")){
						num1 =num.nextInt(10);
						intentos = intentos -1;
						}else if(fila.equals("2")){
							num2 = num.nextInt(10);
							intentos = intentos -1;
							}else if(fila.equals("3")){
								intentos = intentos -1;
								num3 = num.nextInt(10);
								}else if(fila.equals("0")){
									intentos = 0;
									}
					}else{
						intentos =0;
						System.out.println("#######");
						System.out.println("#"+num1+"|"+num2+"|"+num3+"#");
						System.out.println("#######");
						}
					
					if(num1 == num2 && num2 == num3 ){
						System.out.println("Felicidades has ganado 500€ ");
					}else if(num1 == num2 || num2 == num3){
							System.out.println("Felicidades has ganado 250€ ");
					}
			}
			catch (Exception variable) {
				System.out.println("Error")
			}
		}while(intentos > 0);
	}
}
