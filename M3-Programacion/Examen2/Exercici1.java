import java.io.*;
public class Exercici1 {
	public static void main (String args[]) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String quantitat_str,preu_str,salir="si";
		int quantitat,preu,total,total_factura = 0,descomp = 0,total_descomp;
		
		do {
			//Agafar quantitat
			System.out.print("Introdueix una quantitat: ");
			quantitat_str= reader.readLine();
			quantitat = Integer.parseInt(quantitat_str);
			
			while (quantitat <= 0) { //Validar que no sigui 0 ni negatiu
				System.out.println("Dada incorrecta");
				System.out.print("Introdueix una quantitat: ");
				quantitat_str= reader.readLine();
				quantitat = Integer.parseInt(quantitat_str);
			}
			
			//Agafar preu
			System.out.print("Introdueix un preu: ");
			preu_str= reader.readLine();
			preu = Integer.parseInt(preu_str);
			
			while (preu <= 0) { //Validar que no sigui 0 ni negatiu
				System.out.println("Dada incorrecta");
				System.out.print("Introdueix un preu: ");
				preu_str= reader.readLine();
				preu = Integer.parseInt(preu_str);
			}
			
			//Descomptes
			if (quantitat >= 100) {
				total=(int) (preu*quantitat*0.95);
				descomp = (preu*quantitat)-total;
				System.out.println("TOTAL LINIA FACTURA: "+total);
			}else {
				//Calcular total
				total = quantitat*preu;
				System.out.println("TOTAL LINIA FACTURA: "+total);
			}
			
			//Calcular total factura descomptes
			total_descomp = total_factura+total;
			
			//Calcular total factura
			total_factura = total_factura+total+descomp; 
			
			//Preguntar si vol per un nou calcul
			System.out.print("Vols fer un nou calcul (si/no)? ");
			salir = reader.readLine();
			
			//Si no vol fer un calcul sortir
			if (salir.equals("no")) {
				if (descomp>1) { //Si s'ha aplicat descompte sera major a 1 sino imprimeix sols el total
					System.out.println("TOTAL FACTURA SENSE DESCOMPTES: "+total_factura);
					System.out.println("DESCOMPTE APLICAT: "+descomp);
					System.out.println("TOTAL A PAGAR: "+total_descomp);
				}else {
					System.out.println("TOTAL A PAGAR: "+total_factura);
				}
				reader.readLine(); //Serveix per evitar que el break s'activi al instant
				break;
			}
		} while (salir!="no");
	}
}

