package basicos.evaluacioninicial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numero;
		int contadorPares=0, contadorImpares=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca numero positivo: ");
		numero=teclado.nextInt();
		
		
		for (int i=1;i<=numero;i++) {
			if (i%2==0) {
				System.out.println(i + " - par");
				contadorPares++;
			}else {
				System.out.println(i + " - impar");
				contadorImpares++;
			}
		}
		
		System.out.println("Cantidad de números pares: " + contadorPares);
		System.out.println("Cantidad de números pares: " + contadorImpares);

		
	}

}
