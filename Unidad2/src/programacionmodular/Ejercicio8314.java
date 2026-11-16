package programacionmodular;

public class Ejercicio8314 {

	public static int calcularNumeroDivisores(int n) {
		
		int cantidadDivisores=0;
		/*Un número i es divisor de n si n%i==0*/
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				cantidadDivisores++;
			}
		}
		return cantidadDivisores;
	}
	
	public static int[] calcularDivisores(int numero) {
		int tam = calcularNumeroDivisores(numero);
		int [] divisores = new int[tam];
		int j=0;
		for (int i=1;i<=numero;i++) {
			if (numero%i==0) {
				divisores[j]=i;
				j++;
			}
		}
		return divisores;
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
	
	public static int [] calcularComunes(int [] a, int [] b) {
		
		int tam=0;
		if (a.length>b.length) {
			tam=b.length;
		}else if (a.length<b.length) {
			tam=a.length;
		}else {
			tam=a.length;
		}
		int comunes [] = new int[tam];
		//recorremos uno de los arrays
		int indiceComunes=0;//indice para ir insertando elementos en comunes
		for (int i=0;i<a.length;i++) {
			//buscamos cada elemento en el otro
			if(buscarElemento(b,a[i])==true) {//si lo encontramos
				comunes[indiceComunes]=a[i]; //lo añadimos a comunes
				indiceComunes++;
			}
		}
		
		return comunes;
	}
	
	public static int encontrarMaximo(int[] numeros) {
		
		int max=numeros[0];
		
		for (int i=0;i<numeros.length;i++) {
			if (numeros[i]>max) {
				max=numeros[i];
			}
		}
				
		return max;
	}
	
	
	public static int calcularMCD(int a, int b) {
		
		//Calculamos divisores de a
		int [] divisoresA = calcularDivisores(a);
		//Calculamos divisores de b
		int [] divisoresB = calcularDivisores(b);
		//Obtenemos los comunes
		int [] comunes = calcularComunes(divisoresA, divisoresB);
		//Obtenemos el máximo
		int mcd = encontrarMaximo(comunes);

		return mcd;
	}
	
	public static void main(String[] args) {

		int numero1=50;
		int numero2=35;
		
		int mcd = calcularMCD(numero1,numero2);
		System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
		
	}

}
