package programacionmodular;

public class Ejercicio834 {

	public static char obtenerUltimaLetra(String cadena) {
		
		char caracter = cadena.charAt(cadena.length()-1);
				
		return caracter;
		//es valido también return cadena.charAt(0);
		
	}
	
	public static void main(String[] args) {

		String mensaje = "Hola, este es un mensaje";
	
		char ultimaLetra = obtenerUltimaLetra(mensaje);
		
		System.out.println("La última letra es: " + ultimaLetra);
	}

}
