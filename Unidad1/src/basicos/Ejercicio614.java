package basicos;
import java.util.Scanner;

public class Ejercicio614 {

	public static void main(String[] args) {

		int numeroUsuario = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		numeroUsuario=teclado.nextInt();
		
		while (numeroUsuario!=0) {
			
			System.out.println("El cuadrado de " + numeroUsuario + " es " + numeroUsuario*numeroUsuario);
			System.out.println("Introduzca un número: ");
			numeroUsuario=teclado.nextInt();
			
		}
		System.out.println("Programa terminado.");
		
		
	}

}
