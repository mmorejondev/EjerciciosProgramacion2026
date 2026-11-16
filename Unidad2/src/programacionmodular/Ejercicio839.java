package programacionmodular;

public class Ejercicio839 {

	public static void main(String[] args) {
		
		int [] numeros = {1,1,58,42,42,3,3,45,67,3,3,9,17,24,32,14,500,14,16,19};
		
		int max=encontrarMaximo(numeros);
		
		System.out.println("El máximo es: " + max);

	}

	public static int encontrarMaximo(int[] numeros) {
		
		int max=numeros[0];
		
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]>max) {
				max=numeros[i];
			}
		}
				
		return max;
	}
}
