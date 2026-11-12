package basicos;
import java.util.Scanner;

public class Ejercicio541 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroUsuario;
		System.out.println("Introduzca el número 12: ");
		numeroUsuario=teclado.nextInt();
		
		if (numeroUsuario==12) {
			System.out.println("Es correcto.");
		}else {
			System.out.println("No ha introducido el número 12.");
		}
	}

}
