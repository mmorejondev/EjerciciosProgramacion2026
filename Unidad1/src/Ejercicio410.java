import java.util.Scanner;

public class Ejercicio410 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double numero1, numero2;
		float division;
		System.out.println("Introduzca número 1: ");
		numero1 = teclado.nextDouble();
		System.out.println("Introduzca número 2: ");
		numero2 = teclado.nextDouble();
		division = (float)(numero1/numero2);
		System.out.println("La división es: " + division);
	}

}
