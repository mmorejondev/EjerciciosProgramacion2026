package strings;

public class Ejercicio726 {

	public static void main(String[] args) {
		String mensaje = "        Ya     solo     os quedan      dos horitas.       ";

		String sinEspacios = mensaje.replace(" ","");
		
		System.out.println("Sin espacios: ");
		System.out.println(sinEspacios);
	}

}
