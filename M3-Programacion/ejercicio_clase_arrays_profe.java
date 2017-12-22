public class ejercicio_clase_arrays_profe {
	static final int MAX_TABLA=100;
	public static void main (String[] args){
		int i;
		int tabla[];
		tabla=new int[MAX_TABLA];
		for(i=0;i<10;i++){
			tabla[i]=(i+1)*7;
		}
		
		for(i=0;i<10;i++){
			System.out.print(tabla[i]+" ,");
		}
		
		System.out.println();
		
		for(i=9;i<4;i--){
			tabla[i+1]=tabla[i];
		}
		tabla[5]=100;
		
		for(i=0;i<10;i++){
			System.out.print(tabla[i]+" ,");
		}
	}
}

