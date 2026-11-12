package programacionmodular;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio832bis {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca tamaño del array: ");
		int tam=teclado.nextInt();
		
		System.out.println("Introduzca límite superior del rango: ");
		int limiteSuperior=teclado.nextInt();
		
		int [] tabla = crearArray(tam,limiteSuperior);
		
		System.out.println();
		for (int i=0;i<tabla.length;i++) {
			System.out.print("[" + tabla[i] + "]");
		}
		
		
	}

	public static int[] crearArray(int tam, int limiteSuperior) {
		
		int [] numeros = new int[tam];
		Random generador = new Random();
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=generador.nextInt(limiteSuperior+1);
		}
				
		return numeros;
	}


	
}
