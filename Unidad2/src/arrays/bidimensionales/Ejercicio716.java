package arrays.bidimensionales;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio716 {

	public static void main(String[] args) {

		final int FILAS = 6;
		final int COLUMNAS = 4;
		int numeros [][] = new int [FILAS][COLUMNAS];
		Random generador = new Random();
		Scanner teclado = new Scanner(System.in);
		boolean encontrado=false;
		int buscado;
		
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				numeros[i][j]=generador.nextInt(10, 20);
			}
		}
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				System.out.print("[" + numeros[i][j] + "]");
			}
			System.out.println();
		}
		
		
		System.out.println("Introduzca el número a buscar: ");
		buscado=teclado.nextInt();
		
		//Búsqueda del número y mensaje de posición para cada aparición
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				if (numeros[i][j]==buscado) {
					System.out.println("Aparece la posición (" + i + "," + j + ")");
					encontrado=true;
				}
			}
		}
		
		if (encontrado==false) { //(!encontrado)
			System.out.println("El numero " + buscado + " no ha sido encontrado.");
		}
		
		
		
		
		
		
		
		
		
	}

}
