package arrays;

import java.util.Scanner;

public class Ejercicio73 {

	public static void main(String[] args) {
		
		int [] diasPorMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Introduzca número de mes[1-12] (otro para salir): ");
		int numeroDeMes=teclado.nextInt();
				
		while(numeroDeMes>=1 && numeroDeMes<=12) {
				System.out.println();
				System.out.print("El mes " + numeroDeMes + " tiene ");
				System.out.print(diasPorMes[numeroDeMes-1] + " días.");
				System.out.println();
				System.out.println("Introduzca número de mes[1-12] (otro para salir): ");
				numeroDeMes=teclado.nextInt();
						
		}
		System.out.println("Programa terminado.");
		
		
		
	}

}
