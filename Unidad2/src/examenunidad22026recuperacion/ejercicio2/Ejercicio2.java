package examenunidad22026recuperacion.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombreEntrada = teclado.nextLine();
		String nombreFormateado = "";
		String nombreOriginal = nombreEntrada;
		nombreEntrada=nombreEntrada.trim();
		String [] palabras = nombreEntrada.split(" ");
		
		int numPalabras=0;
		for (int i=0;i<palabras.length;i++) {
			if (palabras[i].length()>0) {
			    palabras[i] = palabras[i].substring(0,1).toUpperCase() + palabras[i].substring(1).toLowerCase(); 
			    nombreFormateado = nombreFormateado + palabras[i] + " ";
			    numPalabras++;
			}
		}
			
		
		System.out.println("Nombre original: " + nombreOriginal);
		System.out.println("Numero de palabras reales: " + numPalabras);
		System.out.println("Nombre corregido: " + nombreFormateado);
		
		
	}

}
