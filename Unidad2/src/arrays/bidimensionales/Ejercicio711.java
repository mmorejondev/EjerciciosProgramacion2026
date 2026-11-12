package arrays.bidimensionales;

public class Ejercicio711 {

	public static void main(String[] args) {

		int matrizA [][] = {{5,7,9},{2,5,3},{8,1,9}};
		int matrizB [][] = {{6,8,0},{4,8,7},{6,4,7}};

		//Mostramos por pantalla las dos matrices
		for (int i=0;i<matrizA.length;i++) { //matrizA tiene longitud 3
			for (int j=0;j<matrizA[i].length;j++) { //cada casilla de matrizA tiene un array de longitud 3
				System.out.print("[" + matrizA[i][j] + "]");
			}
			System.out.println();
		}
			
		System.out.println();
		for (int i=0;i<matrizA.length;i++) {
			for (int j=0;j<matrizA[0].length;j++) {
				System.out.print("[" + matrizA[i][j] + "]");
			}
			System.out.println();
		}
		
		int suma [][] = new int [matrizA.length][matrizA[0].length];
		
		for (int i=0;i<suma.length;i++) { 
			for (int j=0;j<suma[0].length;j++) {
				suma[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		System.out.println();
		for (int i=0;i<suma.length;i++) {
			for (int j=0;j<suma[0].length;j++) {
				System.out.print("[" + suma[i][j] + "]");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
