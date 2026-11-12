package basicos;
import java.util.Scanner;

public class Ejercicio411 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float millas, kilometros;
		System.out.println("Introduzca longitud en millas: ");
		millas = teclado.nextFloat();
		/* 
		 * Al escribir un número con decimales, por defecto lo toma como
		 * double. Si queremos representarlo como un float debemos escribir
		 * la letra f tras el número
		 */
		kilometros = millas*1.609f;
		System.out.println("La longitud es: " + kilometros + " kilómetros.");
	}

}
