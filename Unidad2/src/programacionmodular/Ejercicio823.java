package programacionmodular;

import java.util.Scanner;

public class Ejercicio823 {

	public static void dibujarCuadrado(int tam) {
		
		for (int i=0;i<tam;i++) {
			for (int j=0; j<tam;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca lado de cuadrado: ");
		int lado=teclado.nextInt();
		dibujarCuadrado(lado);
	}

}
