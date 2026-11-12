package programacionmodular;

public class Ejercicio833 {

	public static char obtenerPrimeraLetra(String cadena) {
		
		char caracter = cadena.charAt(0);
				
		return caracter;
		//es valido también return cadena.charAt(0);
		
	}
	
	public static void main(String[] args) {

		String mensaje = "Hola, este es un mensaje";
	
		char primeraLetra = obtenerPrimeraLetra(mensaje);
		
		System.out.println("La primera letra es: " + primeraLetra);
	}

}
