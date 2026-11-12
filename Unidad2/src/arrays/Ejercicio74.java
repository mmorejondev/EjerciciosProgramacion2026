package arrays;

import java.util.Scanner;

public class Ejercicio74 {

	public static void main(String[] args) {
		
		long [] numeros = {52,73,37,101,99,2026,2020,900,300,1001};
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca número a buscar: ");
		long numeroBuscado=teclado.nextLong();
		boolean encontrado;
		
		while(numeroBuscado!=-1) {
			encontrado=false;
			for (int i=0;i<numeros.length;i++) {
				if (numeroBuscado==numeros[i]) {
					System.out.println("El número " + numeroBuscado + " está en el array.");
					encontrado=true;
				}
			}	
			
			if (!encontrado) { //(encontrado==false)
				System.out.println("El número " + numeroBuscado + " NO está en el array.");
			}
			
			System.out.println("Introduzca número a buscar: ");
			numeroBuscado=teclado.nextLong();
			
		}
		System.out.println("Programa terminado.");
		
		
		
	}

}
