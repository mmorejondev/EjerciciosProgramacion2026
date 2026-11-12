package basicos;
import java.util.Scanner;

public class Ejercicio639 {

	public static void main(String[] args) {

		byte lado;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca lado: ");
		lado = teclado.nextByte();
		
		for (int i=1;i<=lado;i++) {
					
			for (int j=1;j<=lado;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}