package basicos;
import java.util.Scanner;

public class Ejercicio615 {

	public static void main(String[] args) {

		int pin;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca PIN:");
		pin=teclado.nextInt();
		
		while (pin!=1234) {
			
			System.out.println("PIN INCORRECTO.");
			System.out.println("Introduzca PIN: ");
			pin=teclado.nextInt();
			
		}
		System.out.println("ACCESO PERMITIDO.");
		
		
	}

}
