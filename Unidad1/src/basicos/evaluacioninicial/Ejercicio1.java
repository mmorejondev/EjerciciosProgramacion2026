package basicos.evaluacioninicial;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int edad,numeroHoras;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca edad: ");
		edad=teclado.nextInt();
		System.out.println("Introduzca número de horas diarias: ");
		numeroHoras=teclado.nextInt();
		
		System.out.println("Hola, Miguel.");
		System.out.println("Tienes " + edad + " años.");
		System.out.println("Duermes aproximadamente " + numeroHoras*7 + " horas a la semana.");
		
		
		if (edad >= 18) {
			System.out.println("Ya eres mayor de edad.");
		}else{
			System.out.println("Le faltan " + (18-edad) + " años para cumplir 18 años.");
		}
		
		
		
		
		
		
	}

}
