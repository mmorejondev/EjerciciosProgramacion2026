package basicos;
import java.util.Scanner;

public class Ejercicio551 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Introduzca primer número: ");
		numero1=teclado.nextInt();
		System.out.println("Introduzca segundo número: ");
		numero2=teclado.nextInt();
		
		if ((numero1>0) && (numero2>0)) {
			System.out.println("Los dos son positivos.");
		}else {
			System.out.println("Al menos uno de ellos es negativo.");
		}
	}

}
