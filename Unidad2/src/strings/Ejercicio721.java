package strings;

public class Ejercicio721 {

	public static void main(String[] args) {

		String saludo = "Buenos días, hoy es miércoles.";
		int contadorA=0;
		for (int i=0;i<saludo.length();i++) {
			if (saludo.charAt(i)=='e' || saludo.charAt(i)=='é') {
				contadorA++;
			}
		}
		System.out.println("La letra \'e\' aparece: " + contadorA + " veces.");		
	}

}
