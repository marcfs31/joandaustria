import java.io.*;
public class cronometre {
	public static void main (String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String hores_str,minuts_str,segons_str;
		int hores,minuts,segons,i=0,x=0,z=0;
		
		System.out.print("Hores: ");
		hores_str = reader.readLine(); 
		hores = Integer.parseInt(hores_str);
		
		System.out.print("Minuts: ");
		minuts_str = reader.readLine(); 
		minuts = Integer.parseInt(minuts_str);
		
		System.out.print("Segons: ");
		segons_str = reader.readLine(); 
		segons = Integer.parseInt(segons_str);
		for(i=hores;i>=0;i--){
			for(x=minuts;x>=0;x--){
				for(z=segons;z>=0;z--){
					System.out.println(hores+":"+minuts+":"+segons);
				}
			}
			if(i<60){
				hores--;
			}
			
			if(x<60){
				minuts--;
			}
			
			if(z<60){
				segons--;
			}
		}
	}
}
