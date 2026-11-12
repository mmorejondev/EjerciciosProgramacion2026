import java.util.Scanner;

public class Ejercicio45 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca longitud en millas: ");
		int longitudMillas = teclado.nextInt();
		int longitudEnMetros = longitudMillas*1609;
		System.out.println("Longitud en metros: " + longitudEnMetros);
		
		teclado.close();//Cerramos la entrada de teclado. Es correcto pero no absolutamente necesario.
	}

}
