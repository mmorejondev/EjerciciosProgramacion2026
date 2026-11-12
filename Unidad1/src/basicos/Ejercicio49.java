package basicos;
import java.util.Scanner;

public class Ejercicio49 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		short anyoActual, anyoNacimiento, edad;
		System.out.println("Introduzca año actual: ");
		anyoActual = teclado.nextShort();
		System.out.println("Introduzca de nacimiento: ");
		anyoNacimiento = teclado.nextShort();
		edad = (short)(anyoActual - anyoNacimiento);
		System.out.println("La suma es: " + edad);
	}

}
