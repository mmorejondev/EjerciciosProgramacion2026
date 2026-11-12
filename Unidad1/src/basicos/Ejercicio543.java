package basicos;
import java.util.Scanner;

public class Ejercicio543 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float numero1,numero2;
		System.out.println("Introduzca primer número:");
		numero1 = teclado.nextFloat();
		System.out.println("Introduzca segundo número: ");
		numero2 = teclado.nextFloat();
		
		if (numero1>numero2) {
			System.out.println("El primero es mayor.");
		}else if (numero1<numero2) {
			System.out.println("El segundo es mayor");
		}else{ // también podría haber usado else if (numero1 == numero2)
			System.out.println("Son iguales.");
		}
		
	}

}
