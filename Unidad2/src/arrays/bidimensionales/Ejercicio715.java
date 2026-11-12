package arrays.bidimensionales;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio715 {

	public static void main(String[] args) {

		final int FILAS = 5;
		final int COLUMNAS = 3;
		int numeros [][] = new int [FILAS][COLUMNAS];
		Random generador = new Random();
		Scanner teclado = new Scanner(System.in);
		int buscado;
		int contadorApariciones=0;
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				numeros[i][j]=generador.nextInt(0, 51);
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
		
		//Búsqueda del número y recuento de apariciones
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				if (numeros[i][j]==buscado) {
					contadorApariciones++;
				}
			}
		}
		
		System.out.println("El numero " + buscado + " aparece " + contadorApariciones + " veces.");
		
		
		
		
		
		
		
		
		
		
	}

}
