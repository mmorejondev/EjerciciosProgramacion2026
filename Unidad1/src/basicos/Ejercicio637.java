package basicos;
import java.util.Scanner;

public class Ejercicio637 {

	public static void main(String[] args) {

		long numero;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca numero para determinar si es primo: ");
		numero = teclado.nextLong();
		int contadorDivisores=0;
		for (int i=1;i<=numero;i++){
			if (numero%i==0) {
				contadorDivisores++;
			}
		}
		
		if (contadorDivisores==2) {
			System.out.print("El número " + numero + " es primo.");
		}else {
			System.out.print("El número " + numero + " no es primo.");
		}
	
		teclado.close();
	}

}
