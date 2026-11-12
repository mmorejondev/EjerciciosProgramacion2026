package arrays.bidimensionales;

import java.util.Random;

public class Ejercicio714 {

	public static void main(String[] args) {

		int [][] numeros = {{5,7,6},{3,1,2},{9,8,8}};
		
		/*Mostramos la matriz por pantalla*/
		for (int i=0;i<numeros.length;i++) {
			for (int j=0; j<numeros[i].length;j++) {
					System.out.print("[" + numeros[i][j] + "]");
			}
			System.out.println();
		}
		
		/*Calcular media por fila*/
		for (int fila=0;fila<numeros.length;fila++) {
			int sumaFila = 0;
			float mediaFila = 0.0f;
			for (int columna=0; columna<numeros[fila].length;columna++) {
				sumaFila = sumaFila + numeros[fila][columna];
				
			}
			mediaFila = (float)sumaFila/numeros.length;
			System.out.println("La media de la fila " + fila + " es: "+ mediaFila);
		}
		/*Calcular media por columna*/
		for (int columna=0;columna<numeros.length;columna++) {
			int sumaColumna = 0;
			float mediaColumna = 0.0f;
			for (int fila=0; fila<numeros[columna].length;fila++) {
				sumaColumna = sumaColumna + numeros[fila][columna];
			}
			mediaColumna = (float)sumaColumna/numeros.length;
			System.out.println("La media de la columna " + columna + " es: "+ mediaColumna);
		}
		
		
		
		
		
		
		
	}

}
