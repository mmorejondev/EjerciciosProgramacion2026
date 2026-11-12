package strings;

import java.util.Scanner;

public class EjemplosCadenas {

	public static int sumar (int n1, int n2) {
		
		int suma=n1+n2;
		return suma;
	}
	
	public static void imprimirBienvenida() {
		System.out.println("Bienvenido al programa de suma");
		System.out.println("__________________________________");
	}
	
	
	public static void main(String[] args) {
	
		int numero1,numero2;
		Scanner teclado = new Scanner(System.in);
		
		imprimirBienvenida();
		
		System.out.println("Introduzca numero 1: ");
		numero1=teclado.nextInt();
	
		System.out.println("Introduzca numero 2: ");
		numero2=teclado.nextInt();
		
		
		
		int sum=sumar(numero1,numero2);
		
		System.out.println("La suma de los dos numeros es: " + sum);
		
		
		
	}
	
	

}
