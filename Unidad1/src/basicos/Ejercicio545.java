package basicos;
import java.util.Scanner;

public class Ejercicio545 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroUsuario;
		System.out.println("Introduzca un número: ");
		numeroUsuario=teclado.nextInt();
		
		if (numeroUsuario%2==0) {
			System.out.println("El número es par.");
		}else {
			System.out.println("El número es impar.");
		}
		
	}

}
