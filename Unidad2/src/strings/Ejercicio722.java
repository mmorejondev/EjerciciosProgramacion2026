package strings;

public class Ejercicio722 {

	public static void main(String[] args) {

		String frase = "IsaAc;   nO      ronca,       así.";
		boolean esPalindromo=true;
		
		//pasamos la frase a minuscula
		frase = frase.toLowerCase();
		//reemplazamos las vocales con tilde por vocales sin tilde
		frase = frase.replace('á', 'a');
		frase = frase.replace('é', 'e');
		frase = frase.replace('í', 'i');
		frase = frase.replace('ó', 'o');
		frase = frase.replace('ú', 'u');
		frase = frase.replace('ü', 'u');
		
		//reemplzamos los espacios en blanco por caracter vacio
		frase = frase.replace(" ","");
		frase = frase.replace(":","");
		frase = frase.replace(",","");
		frase = frase.replace(";","");
		frase = frase.replace(".","");
		
		System.out.println(frase);
		
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i) != frase.charAt(frase.length()-i-1)) {
				esPalindromo=false;
			}
		}
		if (esPalindromo==true) {
			System.out.println("Es un palíndromo");
		}else {
			System.out.println("No es un palíndromo");
		}
	}
	
}


