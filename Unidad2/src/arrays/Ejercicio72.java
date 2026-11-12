package arrays;

import java.util.Scanner;

public class Ejercicio72 {

	public static void main(String[] args) {
		final int TAM = 8;
		int [] numeros = new int [TAM];
		Scanner teclado = new Scanner (System.in);
		
		//Insertamos por teclado los 8 números enteros y los guardamos en el array
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduzca número para la posición " + i + ":");
			numeros[i]=teclado.nextInt();	
		}
		
		int max, min;
		//Provisialmente suponemos que el max y el min corresponden al valor de la primera posicion
		min=numeros[0];
		max=numeros[0];
		
		for (int i=0;i<TAM;i++) {
			
			if (numeros[i]>max) {
				max=numeros[i];
			}
			if (numeros[i]<min) {
				min=numeros[i];
			}
		}
		
		System.out.println("El mayor es " + max);
		System.out.println("El menor es " + min);

		
	}

}
