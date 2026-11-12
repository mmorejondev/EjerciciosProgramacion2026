package arrays.bidimensionales;

import java.util.Scanner;

public class Ejercicio79 {

	public static void main(String[] args) {

		char [][] tabla = new char [5][5];
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la fila en la que colocar el carácter 'A': ");
		int filaUsuario = teclado.nextInt();
		
		
		for (int i=0;i<tabla.length;i++) {
			for (int j=0;j<tabla[i].length;j++) {
				
				if(filaUsuario-1 == i) {
					tabla[i][j]='A';
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
