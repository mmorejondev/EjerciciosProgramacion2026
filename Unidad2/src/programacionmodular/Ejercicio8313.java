package programacionmodular;

import java.util.Scanner;

public class Ejercicio8313 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		int numero = teclado.nextInt();
		int [] divisores = calcularDivisores(numero);
		System.out.println("El número " + numero + " tiene " + divisores.length + " divisores.\n");
		for (int i=0;i<divisores.length;i++) {
			System.out.print("[" + divisores[i] +"]");
		}
		
	}

	public static int[] calcularDivisores(int numero) {
		int tam = calcularNumeroDivisores(numero);
		int [] divisores = new int[tam];
		int j=0;
		for (int i=1;i<=numero;i++) {
			if (numero%i==0) {
				divisores[j]=i;
				j++;
			}
		}
		return divisores;
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
