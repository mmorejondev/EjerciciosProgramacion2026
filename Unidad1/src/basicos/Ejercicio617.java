package basicos;
import java.util.Scanner;

public class Ejercicio617 {

	public static void main(String[] args) {

		int numAsteriscos,contador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca número de asteriscos:");
		numAsteriscos=teclado.nextInt();
		
		contador=1;
		while (contador<=numAsteriscos) {
			
			System.out.print(" * ");
			contador++;
		}
		
		
	}

}
