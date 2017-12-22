import java.io.*;
public class Exercici4 {
	public static void main (String[] args) throws IOException  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Iniciar y declarar variables
		int num,cantidad;
		String num_str,cantidad_str,ordenada="";
		
		//Coger cantidad de numeros
		System.out.print("Introdueix numero elements array: ");
		cantidad_str= reader.readLine();
		cantidad = Integer.parseInt(cantidad_str);
		
		while(cantidad<1){ //Evaluar que la cantidad sea minimo 1
			System.out.print("Introdueix numero elements array: ");
			cantidad_str= reader.readLine();
			cantidad = Integer.parseInt(cantidad_str);
		}
		
		//Crear el array
		int nums[];
		nums = new int[cantidad];
		
		//Coger numeros
		for(int i=0;i<nums.length;i++){
			System.out.print("Element "+(i+1)+": ");
			num_str = reader.readLine();
			num = Integer.parseInt(num_str);
			nums[i]=num;
		}
		
		//Comprobar si el array esta ordenada
		for(int x=0;x<nums.length-1;x++){
			if(nums[x]>nums[x+1]){
				ordenada="NO";
			}
		}
		
		//Evaluar si estaba o no ordenada y imprimir lo que toca
		if(ordenada.equals("NO")){
			System.out.println("Array NO ordenada");
		}else{
			System.out.print("Array ordenada: ");
			for(int x=0;x<nums.length;x++){
				System.out.print(nums[x]+",");
			}
		}
	}
}

