import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float base, altura, area;
		System.out.println("Introduzca base: ");
		base = teclado.nextFloat();
		System.out.println("Introduzca altura: ");
		altura = teclado.nextFloat();
		area = (base*altura)/2;
		System.out.println("Área del triángulo: " + area);
		
		
		
	}

}
