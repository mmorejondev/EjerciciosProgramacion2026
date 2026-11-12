package programacionmodular;

import java.util.Scanner;

public class Ejercicio837 {

	
	public static boolean buscarElemento(int [] numeros, int buscado) {
		boolean encontrado=false;
		
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]==buscado) {
				encontrado=true;
			}
		}
		
		return encontrado;
	}
	
	public static void main(String[] args) {

		int [] numeros = {8,1,58,42,3,45,67,9,17,24,32,14,16,19};
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca número a buscar: ");
		int buscado = teclado.nextInt();
		if (buscarElemento(numeros,buscado)) {
			System.out.println("El número "+ buscado + " está en el array.");
			
		}else {
			System.out.println("El número "+ buscado + " no está en el array.");
		}
		
	}

}
