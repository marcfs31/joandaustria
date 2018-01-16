/**
 * Busca un nombre (arraiy ordenada)
 **/ 
import java.io.*;
public class buscar_nombre {
	
	public static void main (String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String inputNum, inputNums;
		int search, searchNum, x, y, l;
		int Num[]={10,15,20,25,50,94,100,120,200};
		
		
		boolean condicio;
		do {
			System.out.print("Quin numero que vols buscar?: ");
			inputNum = r.readLine();
			condicio = CheckString.toNum(inputNum);
		} while(!condicio);
		searchNum = Integer.parseInt(inputNum);
		l = Num.length;
		l--;
		y = l; x = 0;
		search = (x + y) / 2;
		while(x != y && x + 1 != y){
			if (searchNum < Num[search]){
				y = search;
				search = (x + y) / 2;
			}
			else if(searchNum > Num[search]){
				x = search;
				search = (x + y) / 2;
			}
			else if(searchNum == Num[search]){
				System.out.println("L'em trobat a la posico " + search);
				break;
			}
			
		}
		if (x == 0 && y == 1){
			if (searchNum == Num[search]){
			System.out.print("L'em trobat a la posico " + search);
			}
		}
		else if (x == l - 1 && y == l){
			search++;
			if (searchNum == Num[search]){
			System.out.print("L'em trobat a la posico " + search);
			}
		}
		else if (x == y || x + 1 == y){
			System.out.println("No hi es");
		}
	}
}
