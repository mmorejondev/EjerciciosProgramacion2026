import java.util.Scanner;

public class Ejercicio636 {

	public static void main(String[] args) {

		long numero;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca numero: ");
		numero = teclado.nextLong();
		
		int i;		
		for (i=1;i<=numero;i++){
			if (numero%i==0) {
				System.out.print(" " + i);
			}
			
		}
		
	}

}
