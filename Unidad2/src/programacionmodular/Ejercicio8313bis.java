package programacionmodular;

public class Ejercicio8313bis {

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
	
	public static void main(String[] args) {

		int [] numeros1 = {1,2,3,4,6,12};
		int [] numeros2 = {1,2,3,4,6,8,12,24};
		
		int [] comunes = calcularComunes(numeros1,numeros2);
	
		System.out.println("Elementos comunes: \n");
		for (int num: comunes) {
			System.out.print("[" + num + "]");
		}
	
	}

}
