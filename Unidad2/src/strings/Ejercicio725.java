package strings;

public class Ejercicio725 {

	public static void main(String[] args) {

		String mensaje = "Hola 73 _ !";
		String letras = "AaBbCcDdEedFfGgHhIiJjKkLlMmNnÑñOoPpQqRrSsTtUuVvWwXxYyZz";
		String numeros = "0123456789";
		String especiales = "_-?¿¡!@()";
		
		
		
		
		int contadorLetras=0;
		int contadorNumeros=0;
		int contadorEspeciales=0;
		
		for (int i=0;i<mensaje.length();i++) {
			String letra = mensaje.charAt(i) + "";
			
			if (letras.contains(letra)){
				contadorLetras++;
			}else if (numeros.contains(letra)) {
				contadorNumeros++;
			}else if (especiales.contains(letra)){
				contadorEspeciales++;
			}
		}
		System.out.println("Hay " + contadorLetras + " letras.");
		System.out.println("Hay " + contadorNumeros + " números.");
		System.out.println("Hay " + contadorEspeciales + " especiales.");

	}

}
