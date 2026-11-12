package programacionmodular;

public class Ejercicio821 {

	
	public static void limpiarPantalla() {
		
		for (int i=0;i<25;i++) {
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		System.out.println("Esto es un programa \n que imprime \n algunos textos");
		System.out.println("y después \"limpia\" la pantalla");
		
		limpiarPantalla();
	}

	

}
