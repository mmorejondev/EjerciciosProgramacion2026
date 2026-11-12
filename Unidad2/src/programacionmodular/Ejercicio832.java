package programacionmodular;

import java.util.Scanner;

public class Ejercicio832 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca primer número: ");
		int numero1=teclado.nextInt();
		
		System.out.println("Introduzca segundo número: ");
		int numero2=teclado.nextInt();
	
		int menor=calculaMenor(numero1,numero2);
		System.out.println("El menor es: " + menor);
		
	
	}

	public static int calculaMenor(int numero1, int numero2) {
		int menor=Integer.MAX_VALUE;
		
		if (numero1==numero2) {
			menor=numero1; // también sería válido menor=numero2
		}else if (numero1<numero2) {
			menor=numero1;
		}else {
			menor=numero2;
		}
		
		return menor;
	}
	

}
