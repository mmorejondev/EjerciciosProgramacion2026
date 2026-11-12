package basicos;
import java.util.Scanner;

public class Ejercicio544 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroUsuario;
		System.out.println("Introduzca un número:");
		numeroUsuario = teclado.nextInt();
		
		if (numeroUsuario%3==0) {
			System.out.println("El número introducido es múltiplo de 3.");
		}else {
			System.out.println("El número introducido no es múltiplo de 3.");
		}
	}

}
