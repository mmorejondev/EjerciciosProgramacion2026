package ejerciciospaquetes.ejercicio911;

import java.util.Scanner;

public class EntradaSalida {

	public static void escribir (String s) {
		System.out.println(s);
	}
	public static void escribirSinSalto (String s) {
		System.out.print(s);
	}
	public static void escribirSinSalto (int n) {
		System.out.print(n);
	}
	public static String leerCadena() {
		Scanner teclado = new Scanner(System.in);
		String cadena = teclado.nextLine();
		return cadena;
	}
	public static int leerEntero() {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		return numero;
	}


	


}
