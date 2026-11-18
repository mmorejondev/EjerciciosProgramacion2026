package ejerciciospaquetes.ejercicio912;

public class Principal {

	public static void main(String[] args) {

		int [] numeros = {5,10,15,20,24,48,95,190,379,973};
		
		OpArrays.imprimirArray(numeros);
		OpArrays.insertarAleatorios(numeros, 0, 15);
		OpArrays.imprimirArray(numeros);
		if (OpArrays.buscarElemento(numeros,7)) {
			System.out.println("Número encontrado.\n");
		}else {
			System.out.println("Número no encontrado.\n");
		}
		
		System.out.println("El máximo es: "+ OpArrays.calcularMaximo(numeros));
		System.out.println("El mínimo es: "+ OpArrays.calcularMinimo(numeros));
		
		System.out.println("Dos formas de ordenar el array:");
		System.out.println("\nUsando un array como parámetro de entrada y salida");
		System.out.println("Array ordenado: ");
		OpArrays.ordenarArray(numeros);
		OpArrays.imprimirArray(numeros);
		System.out.println("\nUsando un método que devuelve el array ordenado");
		int [] ordenado =OpArrays.ordenarArray2(numeros);
		OpArrays.imprimirArray(ordenado);
		System.out.println("\nLa media aritmética es: " + OpArrays.calcularMedia(numeros));
		System.out.println("\nLa moda es: " + OpArrays.calcularModa(numeros));

	}

}
