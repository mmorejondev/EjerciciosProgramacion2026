package examenunidad22025.ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int opcion=Funcionalidades.mostrarMenu();
		String [] libros = {"El Quijote","Cien años de soledad","La Fundación","El Señor de los Anillos","1984"};
		boolean [] disponibles = {true,true,true,true,true};
		
		while(opcion!=5) {
			if (opcion==1) {
				
				Funcionalidades.mostrarLibros(libros,disponibles);
				
			}else if (opcion==2) {
				int libroPrestado=Funcionalidades.pedirIndiceLibro();
				boolean prestadoCorrectamente=Funcionalidades.prestarLibro(disponibles,libroPrestado);
				if (prestadoCorrectamente) {
					System.out.println("Libro prestado correctamente.");
				}else {
					System.out.println("El libro ya se encuentra prestado.");
				}
				
				
			}else if (opcion==3) {
				int libroPrestado=Funcionalidades.pedirIndiceLibro();
				boolean devueltoCorrectamente=Funcionalidades.devolverLibro(disponibles,libroPrestado);
				if (devueltoCorrectamente) {
					System.out.println("Libro devuelto correctamente.");
				}else {
					System.out.println("El libro no estaba prestado.");
				}
				
			}else if (opcion==4) {
				System.out.println("Contar libros prestados.");
				System.out.println("Hay prestados " + Funcionalidades.contarPrestados(disponibles) + " libros.");
			}
			opcion=Funcionalidades.mostrarMenu();
		}
		
		System.out.println("PROGRAMA TERMINADO.");
		
	}

	

	

}
