package arrays;

import java.util.Scanner;

public class Ejercicio71optimizado {

	public static void main(String[] args) {

		final int TAM = 5;
		float [] numeros = new float [TAM];
		Scanner teclado = new Scanner (System.in);
		
		//Insertamos por teclado los 5 números reales y los guardamos en el array
		float sumaNumeros = 0.0f;
		for (int i=0;i<TAM;i++) {
			System.out.println("Introduzca número para la posición " + i + ":");
			numeros[i]=teclado.nextFloat();	
			sumaNumeros = sumaNumeros + numeros[i];
		}
		
		float media = sumaNumeros/TAM;
		System.out.println("La media es: " + media);
		
		int mayoresQueMedia=0;
		
		//Mostramos los valores que son mayores que la media
		System.out.println("Valores mayores que la media: ");
		for (int i=0;i<TAM;i++) {
			if (numeros[i]>media) {
				System.out.print(" " + numeros[i]);
				mayoresQueMedia++;
			}
		}
		System.out.println("Hay " + mayoresQueMedia + " números mayores que la media.");
					
		
	}

}
