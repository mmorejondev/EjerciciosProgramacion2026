package ejerciciospaquetes.ejercicio912;

import java.util.Random;

public class OpArrays {

	public static void imprimirArray(int [] a) {
		System.out.println();
		for (int i=0;i<a.length;i++) {
			System.out.print("["+a[i]+"]");
		}
	}
	
	public static void insertarAleatorios(int [] numeros, int minimo, int maximo) {
		Random generador = new Random();
		for (int i=0;i<numeros.length;i++) {
			numeros[i]=generador.nextInt(minimo, maximo+1);
		}
		
	}
	
	public static boolean buscarElemento(int[] array, int elemento) {
		boolean encontrado=false;
		for (int i=0;i<array.length;i++) {
			if (array[i]==elemento) {
				encontrado=true;
			}
		
		}
		
		return encontrado;
		
	} 
	
}
