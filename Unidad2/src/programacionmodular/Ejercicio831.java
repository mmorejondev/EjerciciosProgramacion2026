package programacionmodular;

import java.util.Scanner;

public class Ejercicio831 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca numero: ");
		float numero = teclado.nextFloat();
		System.out.println("El cubo de " + numero + " es: " + calcularCubo(numero));
	}

	public static float calcularCubo(float numero) {
		// TODO Auto-generated method stub
		return numero*numero*numero;
	}

}
