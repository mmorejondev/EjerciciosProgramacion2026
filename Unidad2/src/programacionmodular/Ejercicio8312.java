package programacionmodular;

import java.util.Scanner;

public class Ejercicio8312 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		int numero = teclado.nextInt();
		int cantidadDivisores = calcularNumeroDivisores(numero);
		System.out.println("El número " + numero + " tiene " + cantidadDivisores + " divisores.");
		
	}

	public static int calcularNumeroDivisores(int n) {
		
		int cantidadDivisores=0;
		/*Un número i es divisor de n si n%i==0*/
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				cantidadDivisores++;
			}
		}
		return cantidadDivisores;
	}

}
