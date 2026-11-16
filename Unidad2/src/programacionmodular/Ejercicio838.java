package programacionmodular;

public class Ejercicio838 {

	public static boolean buscarElemento(int [] numeros, int buscado) {
		boolean encontrado=false;
		
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]==buscado) {
				encontrado=true;
			}
		}
		
		return encontrado;
	}
	
	public static int [] eliminarDuplicados(int [] conDuplicados) {
	
		//creamos un nuevo array vacío en el que no habrá duplicados
		int [] unicos = new int[conDuplicados.length];
		/*recorremos el array conDuplicados y 
		cada elemento lo buscamos en el array sinDuplicados*/
		int posicionUnico=0;
		for (int i=0;i<conDuplicados.length;i++) {
			/*si no está, lo metemos en sinDuplicados
			en la posicion que indique posicionUnico*/
			if (buscarElemento(unicos,conDuplicados[i])==false) {
				unicos[posicionUnico]=conDuplicados[i];
				posicionUnico++;
				
			}
		}
		//posicionUnico en este punto contiene el número de elementos únicos
		//Creamos un array (unicos2) de ese tamaño 
		//y copiamos en él los elementos del array unicos
		int [] unicos2 = new int [posicionUnico];
		for (int i=0;i<unicos2.length;i++) {
			unicos2[i]=unicos[i];
		}
		
		return unicos2;
		
	}
	
	
	public static void main(String[] args) {
		int [] numeros = {1,1,58,42,42,3,3,45,67,3,3,9,17,24,32,14,14,14,16,19};
		System.out.println("Array con elementos duplicados: \n");
		
		for(int i=0;i<numeros.length;i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		int [] sinDuplicados = eliminarDuplicados(numeros);
		
		System.out.println("\nArray sin elementos duplicados: \n");
		
		for(int i=0;i<sinDuplicados.length;i++) {
			System.out.print("[" + sinDuplicados[i] + "]");
		}
		
		

	}

}
