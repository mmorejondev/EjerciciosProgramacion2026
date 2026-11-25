package examenunidad22026recuperacion.ejercicio1;

import java.util.Scanner;

public class Funcionalidades {

	public static int contarReservadas(boolean[] reservadas) {
		int cantidadReservadas=0;
		for (int i=0;i<reservadas.length;i++) {
			if (reservadas[i]) {
				cantidadReservadas++;
			}
		}
		return cantidadReservadas;
	}
	
	public static int pedirIndiceSala() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca número de sala: ");
		int sala = teclado.nextInt();
		while (sala < 0 || sala >5) {
			System.out.println("Número de sala incorrecto.");
			System.out.println("Introduzca número de sala: ");
			sala=teclado.nextInt();
		}
		
		return sala;
	}
	
	public static void mostrarSalas(String[] salas, boolean[] reservadas) {
		 for (int i=0;i<salas.length;i++) {
			 if (reservadas[i]) {
				 System.out.println(i + " - " + salas[i] + " - " + " Reservada");
			 }else {
				 System.out.println(i + " - " + salas[i] + " - " + " Disponible");

			 }
		 }
	 }
	
	static boolean reservarSala(boolean[] reservadas, int sala) {
		boolean reserva=false;
		if (reservadas[sala]==false) {
			reservadas[sala]=true;
			reserva=true;
		}
		return reserva;
	}
	
	static boolean liberarSala(boolean[] reservadas, int sala) {
		boolean liberada=false;
		if (reservadas[sala]==true) {
			reservadas[sala]=false;
			liberada=true;
		}
		return liberada;
	}
	
	public static int mostrarMenu() {
		System.out.println("1. Ver listado de salas");
		System.out.println("2. Reservar una sala");
		System.out.println("3. Liberar una sala");
		System.out.println("4. Mostrar cuántas salas están reservadas");
		System.out.println("5. Terminar");

		Scanner teclado = new Scanner (System.in);
		int opcion = teclado.nextInt();
		while (opcion < 1 || opcion >5) {
			System.out.println("Opción incorrecta.");
			System.out.println("1. Ver listado de salas");
			System.out.println("2. Reservar una sala");
			System.out.println("3. Liberar una sala");
			System.out.println("4. Mostrar cuántas salas están reservadas");
			System.out.println("5. Terminar");
			opcion = teclado.nextInt();

		}
			
		return opcion;
	}
}
