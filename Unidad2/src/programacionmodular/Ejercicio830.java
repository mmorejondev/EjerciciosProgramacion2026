package programacionmodular;

import java.util.Scanner;

public class Ejercicio830 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca ancho: ");
		int ancho=teclado.nextInt();
		
		System.out.println("Introduzca alto: ");
		int alto=teclado.nextInt();
		
		int area=dibujarRectangulo(ancho,alto);
		System.out.println("El area es: " + area);
	}

	public static int dibujarRectangulo(int ancho, int alto) {

		for (int i=0;i<alto;i++) {
			for (int j=0; j<ancho;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		int area = ancho*alto;
		return area;
	}

	

}
