import java.io.*;
public class Exercici1 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Iniciar y declarar variables
		int hores,minuts,segons,major;
		String hores_str,minuts_str,segons_str,gran;
		
		//Coger cantidad de numeros
		System.out.print("Introdueix les hores: ");
		hores_str= reader.readLine();
		hores = Integer.parseInt(hores_str);
		
		System.out.print("Introdueix els minuts: ");
		minuts_str= reader.readLine();
		minuts = Integer.parseInt(minuts_str);
		
		System.out.print("Introdueix els segons: ");
		segons_str= reader.readLine();
		segons = Integer.parseInt(segons_str);
		
		for(int a=60;a>0;a--){
			
			for(int i=hores;i>=0;i--){
				if(i<10){
					System.out.println("0"+i+":");
				}else{
					System.out.println(i+":");
				}
			}
			
			for(int x=minuts;x>=0;x--){
				if(x<10){
					System.out.print(":0"+x+":");
				}else{
					System.out.print(":"+x+":");
				}
			}
			
			for(int z=segons;z>=0;z--){
				if(z<10){
					System.out.println("0"+z);
				}else{
					System.out.println(z);
				}
			}
		}
	}
}

