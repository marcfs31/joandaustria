import java.util.Arrays;

public class busqueda_dicotomica {
	
	public static void main (String[] args) {
		int[] ints = {0,2,4,6,8,10};

		int index = Arrays.binarySearch(ints, 6);

		System.out.println(index);
	}
}

