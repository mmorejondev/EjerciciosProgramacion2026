package basicos;
import java.util.Scanner;

public class Ejercicio635 {

	public static void main(String[] args) {

		int limite;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca límite: ");
		limite = teclado.nextInt();
		
		
		for (int i=1;i<=limite;i++){
			if (i%3==0 && i%7==0) {
				System.out.print(" " + i);
			}
			
		}
		
	}

}
