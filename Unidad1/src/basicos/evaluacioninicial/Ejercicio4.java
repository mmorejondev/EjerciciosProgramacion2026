package basicos.evaluacioninicial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca numero positivo: ");
		numero=teclado.nextInt();
		int contadorNumeros=0;
		int sumaNumeros=0;
		int contadorPositivos=0;
		int contadorNegativos=0;
		
		while(numero!=0) {
						
			if (numero>0) {
				contadorPositivos++;
			}
			if (numero<0) {
				contadorNegativos++;
			}
			
			contadorNumeros++;
			sumaNumeros=sumaNumeros+numero;
			System.out.println("Introduzca numero positivo: ");
			numero=teclado.nextInt();
						
		}
	
		System.out.println("Números introducidos: " + contadorNumeros);
		System.out.println("Suma: " + sumaNumeros);
		System.out.println("Positivos: " + contadorPositivos);
		System.out.println("Negativos: " + contadorNegativos);
		
	
	}

}
