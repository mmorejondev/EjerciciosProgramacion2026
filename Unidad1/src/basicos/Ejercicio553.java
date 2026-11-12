package basicos;
import java.util.Scanner;

public class Ejercicio553 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Introduzca primer número: ");
		numero1=teclado.nextInt();
		System.out.println("Introduzca segundo número: ");
		numero2=teclado.nextInt();
		
		if ((numero1%2==0) && (numero2%2==0)) {
			
			System.out.println("Los dos números son pares.");
		
		}else if ((numero1%2==1) && (numero2%2==1)){
		
			System.out.println("Ninguno de ellos es par.");
			
		}else {
			System.out.println("Uno es par y otro impar.");
		}
	}

}
