package basicos;
import java.util.Scanner;

public class Ejercicio6311 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca un número: ");
		int numeroUsuario = teclado.nextInt();
		int cantidadNumeros = 0;
		int sumaNumeros = 0;
		
		while(numeroUsuario!=0) {
		
			cantidadNumeros++;
			sumaNumeros = numeroUsuario + sumaNumeros;
			System.out.println("Introduzca un número: ");
			numeroUsuario = teclado.nextInt();
			
		
		}
		
		System.out.println("Ha introducido " + cantidadNumeros + " números.");
		System.out.println("La suma total es " + sumaNumeros);
				
		
	}

}
