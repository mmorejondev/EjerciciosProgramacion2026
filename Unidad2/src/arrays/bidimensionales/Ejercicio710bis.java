package arrays.bidimensionales;

import java.util.Scanner;

public class Ejercicio710bis {

	public static void main(String[] args) {

		char [][] tabla = new char [5][5];
				
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[i].length;j++) {
				
				if (i==j) {
					tabla[i][j]='X';
				}else {
					tabla[i][j]='.';
				}
			}
		}
		
		
		
		//Mostramos por pantalla el resultado
		System.out.println();
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[i].length;j++) {
				System.out.print(tabla[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
