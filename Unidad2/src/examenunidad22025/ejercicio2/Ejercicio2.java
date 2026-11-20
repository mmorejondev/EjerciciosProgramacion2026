package examenunidad22025.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        // 1. Pedir al usuario que introduzca una frase completa
		        System.out.print("Introduce una frase completa: ");
		        String fraseOriginal = scanner.nextLine();

		        // Limpiar espacios al inicio y al final
		        String fraseLimpia = fraseOriginal.trim();
		        
		        String [] palabras = fraseLimpia.split(" ");
		        int contadorPalabras=0;
		        for (int i=0;i<palabras.length;i++) {
		        	if (palabras[i].length()>0) {
		        		palabras[i]=palabras[i].toLowerCase();
		        		contadorPalabras++;
		        	}
		        		
		        }
		       
		        String fraseTransformada = "";
		        
		        for (int i=0;i<palabras.length;i++) {
		        	if (palabras[i].length()>0) {
		        		palabras[i]=palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
		        		fraseTransformada += palabras[i] + " ";
		 		       
		        	}
		       		
		        }

		       
		        
		        // 4. Mostrar los resultados por pantalla
		        System.out.println("\n--- Resultados ---");
		        System.out.println("Frase original: " + fraseOriginal);
		        System.out.println("Número total de palabras reales: " + contadorPalabras);
		        System.out.println("Nueva frase transformada: " + fraseTransformada );

		        
	}
}
