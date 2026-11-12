package basicos.evaluacioninicial;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int nota;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca nota: ");
		nota=teclado.nextInt();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota incorrecta.");
		}else if (nota < 5) {
			System.out.println("Suspenso.");
		}else if (nota >=5 && nota < 6) {
			System.out.println("Aprobado.");
		}else if (nota >=6 && nota < 7) {
			System.out.println("Bien.");
		}else if (nota >=7 && nota <9) {
			System.out.println("Notable.");
		}else if (nota >=9 && nota <=10){
			System.out.println("Sobresaliente.");
		}
		
	}

}
