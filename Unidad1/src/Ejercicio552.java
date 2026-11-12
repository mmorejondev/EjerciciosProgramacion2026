import java.util.Scanner;

public class Ejercicio552 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Introduzca primer número: ");
		numero1=teclado.nextInt();
		System.out.println("Introduzca segundo número: ");
		numero2=teclado.nextInt();
		
		if ((numero1>=0) || (numero2>=0)) { //Considerando al 0 positivo
			System.out.println("Al menos uno de los números es positivo.");
		}else {
			System.out.println("Los dos números son negativos.");
		}
	}

}
