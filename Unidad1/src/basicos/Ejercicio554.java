package basicos;
import java.util.Scanner;

public class Ejercicio554 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		long numero1, numero2, numero3;
		
		System.out.println("Introduzca primer número: ");
		numero1=teclado.nextInt();
		System.out.println("Introduzca segundo número: ");
		numero2=teclado.nextInt();
		System.out.println("Introduzca tercer número: ");
		numero3=teclado.nextInt();
		
		if (numero1==numero2 && numero2==numero3) { //Los tres números son iguales
			
			System.out.println("Los tres números son iguales.");
		
		}else if (numero1>=numero2 && numero1>=numero3){ // El primero es mayor o igual que el segundo y mayor o igual que el tercero
		
			System.out.println("El primero es el mayor.");
			
		}else if (numero2>=numero1 && numero2>=numero3){ // El segundo es mayor o igual que el primero y el segundo es mayor o igual que el tercero.
			
			System.out.println("El segundo es el mayor.");
		}else { //si no se han cumplido ninguna de las anteriores condiciones, solo queda que el mayor sea el tercero.
			
			System.out.println("El tercero es el mayor.");
		}
	}

}
