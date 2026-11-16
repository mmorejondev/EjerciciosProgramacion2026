package programacionmodular;

public class Ejercicio8310 {

	public static int[] invertirArray(int[] numeros) {
		
		int [] inv = new int[numeros.length];
		for (int i=0;i<numeros.length;i++) {
			inv[i]=numeros[numeros.length-1-i];
		}
		
		return inv;
	}

	public static int[] invertirArray2(int [] numeros) {
		int [] inv = new int [numeros.length];
		int j=0; // para recorrer el array invertido
		for (int i=numeros.length-1;i>=0;i--) {
			inv[j] = numeros[i];
			j++;
		}
		return inv;
	}
	
	
	public static void main(String[] args) {
		int [] numeros = {1,1,58,42,42,3,3,45,67,3,3,9,17,24,32,14,500,14,16,19};
		
		int [] invertido1 = invertirArray(numeros);
		int [] invertido2 = invertirArray2(numeros);
		System.out.println("Array Invertido: \n");
		
		for (int i=0;i<invertido1.length;i++) {
			System.out.print("["+ invertido1[i] + "]");
		}
		
		
		System.out.println("\nArray Invertido con el segundo método: \n");
		
		for (int i=0;i<invertido2.length;i++) {
			System.out.print("["+ invertido2[i] + "]");
		}
		
		
		
		/*Otra forma de recorrer un array*/
		/*for (int num: invertido) {	
			System.out.print("["+ num + "]");
		}*/
		

	}

	
}
