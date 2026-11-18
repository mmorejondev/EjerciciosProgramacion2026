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
	
		
	public static boolean buscarElemento(int [] numeros, int buscado) {
		
		boolean encontrado=false;
		
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]==buscado) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	
	public static int calcularMaximo(int [] numeros) {
		
		int maximo=numeros[0];
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]>maximo) {
				maximo=numeros[i];
			}
		}
		return maximo;
		
	}
	
	public static int calcularMinimo(int [] numeros) {
		int minimo=numeros[0];
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]<minimo) {
				minimo=numeros[i];
			}
		}
		return minimo;
	}
	
	public static int calcularMinimoParaOrdenacion(int [] numeros) {
		int minimo=numeros[0];
		int posicionMinimo=0;
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]<minimo) {
				minimo=numeros[i];
				posicionMinimo=i;
			}
		}
		numeros[posicionMinimo]=Integer.MAX_VALUE;
		return minimo;
	}
	
	public static void ordenarArray(int [] numeros) {
		//crear un array vacio del mismo tamaño que el original
		//recorrer el array vacio e ir insertando en cada posición
		//el minimo del array original (sustituir el minimo que hayamos encontrado)
		// por el número "+infinito" (Integer.MAX_VALUE)
		
		int [] ordenado = new int[numeros.length];
		
		for (int i=0;i<ordenado.length;i++) {
			ordenado[i]=calcularMinimoParaOrdenacion(numeros);
		}
		
		
		//volcamos el array ordenado en el array que nos pasan como parametro		
		for (int i=0;i<ordenado.length;i++) {
			numeros[i]=ordenado[i];
		}
		
	}
	
	/*Esta es otra forma de ordenar el array. El array ordenado se devuelve.*/
	public static int [] ordenarArray2(int [] numeros) {
		//crear un array vacio del mismo tamaño que el original
		//recorrer el array vacio e ir insertando en cada posición
		//el minimo del array original (sustituir el minimo que hayamos encontrado)
		// por el número "+infinito" (Integer.MAX_VALUE)
		int [] arrayOriginal= new int[numeros.length];
		for (int i=0;i<arrayOriginal.length;i++) {
			arrayOriginal[i]=numeros[i];
		}
		int [] ordenado = new int[numeros.length];
		
		for (int i=0;i<ordenado.length;i++) {
			ordenado[i]=calcularMinimoParaOrdenacion(numeros);
		}
		
		for (int i=0;i<arrayOriginal.length;i++) {
			numeros[i]=arrayOriginal[i];
		}
		
		
		return ordenado;
	}
	
	
	
	
	public static double calcularMedia(int [] numeros) {
		
		int sumaNumeros=0;
		double media=0.0;
		for (int i=0;i<numeros.length;i++) {
			sumaNumeros=sumaNumeros+numeros[i];
		}
		media = (double)sumaNumeros/numeros.length;
		return media;
	}
	
	public static int calcularModa(int [] numeros) {
		
		int contadorMaximo=0;
		int moda=0;
				
		for (int i=0;i<numeros.length;i++) {
			//Para cada numero del array contamos cuantas veces aparece
			int contador=0;
			for (int j=0;j<numeros.length;j++) {
				if (numeros[i]==numeros[j]) {
					contador++;
				}
			}
			
			if (contador>contadorMaximo) {
				contadorMaximo=contador;
				moda=numeros[i];
			}
			
		}
		return moda;
		
	}
	
	
	
}
