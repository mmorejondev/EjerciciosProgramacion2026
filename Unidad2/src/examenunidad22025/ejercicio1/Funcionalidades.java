package examenunidad22025.ejercicio1;

import java.util.Scanner;

public class Funcionalidades {
	public static int mostrarMenu() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("MENÚ DE OPCIONES"); 
		System.out.println("1. Ver libros"); 
		System.out.println("2. Prestar libro"); 
		System.out.println("3. Devolver libro"); 
		System.out.println("4. Mostrar libros prestados"); 
		System.out.println("5. Terminar");
		
		int eleccionUsuario=teclado.nextInt();
		
		while(eleccionUsuario<1 || eleccionUsuario>5) {
			System.out.println("OPCIÓN INCORRECTA.");
			System.out.println("MENÚ DE OPCIONES"); 
			System.out.println("1. Ver libros"); 
			System.out.println("2. Prestar libro"); 
			System.out.println("3. Devolver libro"); 
			System.out.println("4. Mostrar libros prestados"); 
			System.out.println("5. Terminar");
			
			eleccionUsuario=teclado.nextInt();
				
		}
		return eleccionUsuario;
	}
	
	static void mostrarLibros(String[] titulos, boolean[] prestados) {
		for (int i=0;i<titulos.length;i++) {
			if (prestados[i]) {
				System.out.println(i + " - " + titulos[i] + " - " + "Disponible.");
			}else {
				System.out.println(i + " - " + titulos[i] + " - " + "No disponible.");
			}
		}
	}
	
	
	public static int pedirIndiceLibro() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número del libro (0-4): ");
		int indice=teclado.nextInt();
		teclado.nextLine();
		
		while(indice<0 || indice>4) {
			System.out.println("Entrada incorrecta.");
			indice=teclado.nextInt();
			teclado.nextLine();
		}
		
		return indice;
		
	}
	
	
	static boolean prestarLibro(boolean[] prestados, int indice) {
		boolean prestado=false;
		
		if (prestados[indice]) {
			prestados[indice]=false;
			prestado=true;
		}
		return prestado;
				
	}
	
	
	static boolean devolverLibro(boolean[] prestados, int indice) {
		boolean devuelto=false;
		
		if (!prestados[indice]) {
			prestados[indice]=true;
			devuelto=true;
		}
		return devuelto;
				
	}
	
	public static int contarPrestados(boolean[] disponibles) {
		int numeroPrestados=0;
		for (int i=0;i<disponibles.length;i++) {
			if (!disponibles[i]) {
				numeroPrestados++;
			}
		}
		return numeroPrestados;
	}
	
	
	
}
