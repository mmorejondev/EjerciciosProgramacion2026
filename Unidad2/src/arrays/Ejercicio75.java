package arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio75 {

	public static void main(String[] args) {

		final int TAM = 100;
		int [] numeros = new int[TAM];
		int opcionUsuario;
		
		Random generador = new Random();
		Scanner teclado = new Scanner(System.in);
		
		
		for (int i=0;i<=49;i++) {
			numeros[i]=generador.nextInt(201);
		}
		
		int contadorDatos=50; 
		
		
		System.out.println("Seleccione opción: ");
		System.out.println("1.- Insertar un nuevo dato.");
		System.out.println("2.- Buscar un dato.");
		System.out.println("3.- Imprimir el array.");
		System.out.println("0.- Salir");
		opcionUsuario=teclado.nextInt();
		
		while (opcionUsuario!=0) {
			if (opcionUsuario==1) {
				//Insertamos nuevo dato
				System.out.println("Introduzca número a insertar:");
				int numeroNuevo=teclado.nextInt();
				numeros[contadorDatos]= numeroNuevo;
				contadorDatos++;
						
				
			}else if (opcionUsuario==2) {
				//Buscar dato
				System.out.println("Introduzca número a buscar:");
				int numeroBuscado=teclado.nextInt();
				boolean encontrado=false;
				for (int i=0;i<contadorDatos;i++) {
					if (numeroBuscado==numeros[i]) {
						encontrado=true;
					}
				}
				
				if (encontrado==false) {
					System.out.println("Número no encontrado.");
				}else {
					System.out.println("Número encontrado.");
				}
				
			}else if (opcionUsuario==3) {
				//Mostramos el array
				System.out.println();
				for (int i=0;i<contadorDatos;i++) {
					System.out.print("[" + numeros[i] + "] ");
				}
				System.out.println();
			}else {
				System.out.println("Opción incorrecta.");
			}
			
			System.out.println("Seleccione opción: ");
			System.out.println("1.- Insertar un nuevo dato.");
			System.out.println("2.- Buscar un dato.");
			System.out.println("3.- Imprimir el array.");
			System.out.println("0.- Salir");
			opcionUsuario=teclado.nextInt();
			
						
		}
		System.out.println("Programa finalizado.");
		
		
		
		
		
	}

}
