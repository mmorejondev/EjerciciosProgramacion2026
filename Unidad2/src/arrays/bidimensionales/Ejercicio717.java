package arrays.bidimensionales;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio717 {

	public static void main(String[] args) {

		final int FILAS = 4;
		final int COLUMNAS = 6;
		int numeros [][] = new int [FILAS][COLUMNAS];
		Random generador = new Random();
		Scanner teclado = new Scanner(System.in);
		boolean encontrado=false;
		int buscado;
		
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				numeros[i][j]=generador.nextInt(0, 21);
			}
		}
		
		//Sabemos que hay hasta 20 número distintos, según el enunciado
		int recuento [] = new int [20+1]; //20 naturales más el cero

		//imprimimos el array por pantalla
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
				System.out.print("[" + numeros[i][j] + "]");
			}
			System.out.println();
		}
		
				
		//Recorrido del array y recuento de apariciones para cada elemento distinto
		
		for (int i=0;i<FILAS;i++) {
			for (int j=0;j<COLUMNAS;j++) {
					recuento[numeros[i][j]]++;
			}
		}
		
		for (int i=0;i<recuento.length;i++) {
			if (recuento[i]!=0) {
				System.out.println("El número " + i + " aparece " + recuento[i] + " veces.");
			}
		}
		
		
		
		
		
		
		
		
	}

}
