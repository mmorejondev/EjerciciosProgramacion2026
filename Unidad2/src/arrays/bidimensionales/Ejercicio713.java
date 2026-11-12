package arrays.bidimensionales;

import java.util.Random;

public class Ejercicio713 {

	public static void main(String[] args) {

		final int TAM = 5;
		int [][] numeros = new int [TAM][TAM];
		
		
		for (int i=0;i<numeros.length;i++) {
			for (int j=0; j<numeros[i].length;j++) {
				if (i!=j) {
					numeros[i][j]=0;
				}else {
					numeros[i][j]=i;
				}
			}
		}
		
		for (int i=0;i<numeros.length;i++) {
			for (int j=0; j<numeros[i].length;j++) {
				if (numeros[i][j]<10) {
					System.out.print("[ " + numeros[i][j] + "]");
				}else {
					System.out.print("[" + numeros[i][j] + "]");
				}
				
			}
			System.out.println();
		}
				
		
		
	}

}
