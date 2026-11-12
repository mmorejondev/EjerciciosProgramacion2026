package programacionmodular;

public class Ejercicio835 {

	public static boolean esPrimo(int numero) {
		
		boolean primo=false;
		int cantidadDivisores=0;
		for (int i=1;i<=numero;i++) {
			if (numero%i==0) {
				cantidadDivisores++;
			}
		}
		
		if (cantidadDivisores==2) {
			primo=true;
		}
		
		return primo;
	}
	
	
	public static void main(String[] args) {

		
		int numeros [] = {3,7,6,8,11,7,1,9,73,37};
		
		for (int i=0;i<numeros.length;i++) {
			if (esPrimo(numeros[i])) {
				System.out.println("El número " + numeros[i] + " es primo.");
			}else {
				System.out.println("El número " + numeros[i] + " no es primo.");
	
			}
		}
	}

}
