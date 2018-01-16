/*programa que donats dos números enters, ens suma tots els que hi han al rang (inclosos ells mateixos)*/

import java.io.*;
 
public class Examen1Bien{
	public static void main(String[] args) throws IOException {
		int i,ini,fin,sum=0;
		String linia;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Introdueix primer numero: ");
		linia = reader.readLine();
		ini= Integer.parseInt(linia);
		
		System.out.print("Introdueix segon numero: ");
		linia = reader.readLine();
		fin = Integer.parseInt(linia);

		if (fin < ini){
			System.out.println("El segon numero no pot esser inferior al primer\n");
		} else{
			for (i=ini;i<=fin;i++){ /*Fem la suma*/
				sum=sum+i;
			}
			System.out.println("La suma del rang és: "+sum);
		}
	}
}
