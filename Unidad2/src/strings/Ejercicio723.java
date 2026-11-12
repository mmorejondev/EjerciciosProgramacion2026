package strings;

public class Ejercicio723 {

	public static void main(String[] args) {

		String frase = "Hoy por dEsgraciA es vierneS.";
		//La frase debe quedar así: hOY POR DeSGRACIa ES VIERNEs
		String todoMayus = frase.toUpperCase();
		String todoMinus = frase.toLowerCase();
		
		System.out.println(frase);
		System.out.println(todoMayus);
		System.out.println(todoMinus);
			
		String convertida = "";
		for (int i=0;i<frase.length();i++) {
			if (frase.charAt(i) == todoMayus.charAt(i)) {
				convertida = convertida + todoMinus.charAt(i);
			}else if (frase.charAt(i) == todoMinus.charAt(i)) {
				convertida = convertida + todoMayus.charAt(i);
			}
			
		}
		System.out.println("Frase convertida: ");
		System.out.println(convertida);
		
		
		
	}

}
