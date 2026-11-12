package arrays;

public class Ejercicio76 {

	public static void main(String[] args) {

		int [] edades = {21,19,22,17,26,21,18,17,16,23,20,19,18,17,25,21,18,17,17,23};
		
		int [] edadesOrdenado = new int[edades.length];
	
		System.out.println("Array desordenado: ");
		for (int i=0;i<edades.length;i++) {
			System.out.print("[" + edades[i] + "]");
		}
		System.out.println();
	
		
		
		
		for (int i=0;i<edadesOrdenado.length;i++) {
			//para cada casilla del ordenado vamos a colocar el mínimo del desordenado
			
			int minimo=edades[0];
			int posicionMinimo=0;
			//buscamos el mínimo en edades
			for (int j=0;j<edades.length;j++) {
				if (edades[j]<minimo) {
					minimo=edades[j];
					posicionMinimo=j;
				}
			}//en este punto sabemos quién es el mínimo y qué posición ocupa
			
			//En el array original cambiamos el mínimo por un valor "absurdo"
			edades[posicionMinimo] = Integer.MAX_VALUE;
			
			edadesOrdenado[i]=minimo;//colocamos el minimo en la casilla de esta vuelta para el array ordenado
			
		}
		System.out.println();
		System.out.println("Array ordenado: ");
		
		for (int i=0;i<edadesOrdenado.length;i++) {
			System.out.print("[" + edadesOrdenado[i] + "]");
		}
		System.out.println();
		
	
		System.out.println("Array desordenado: ");
		for (int i=0;i<edades.length;i++) {
			System.out.print("[" + edades[i] + "]");
		}
		System.out.println();
	
	
		
		
	}

}
