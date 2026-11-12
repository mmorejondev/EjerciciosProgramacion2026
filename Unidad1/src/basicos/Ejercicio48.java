package basicos;
import java.util.Scanner;

public class Ejercicio48 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		byte numero1, numero2, suma;
		System.out.println("Introduzca número 1: ");
		numero1 = teclado.nextByte();
		System.out.println("Introduzca número 2: ");
		numero2 = teclado.nextByte();
		suma = (byte)(numero1+numero2);
		System.out.println("La suma es: " + suma);
		
	}

}
