import java.util.Scanner;

public class Ejercicio542 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroUsuario;
		System.out.println("Introduzca un número: ");
		numeroUsuario=teclado.nextInt();
	
		if (numeroUsuario==0) {
			System.out.println("El número introducido es 0.");
		}else if (numeroUsuario > 0) {
			System.out.println("El número es mayor que 0 (positivo).");
		}else if (numeroUsuario < 0){//en este caso también podríamos haber usado un else
			System.out.println("El número es menor que 0 (negativo).");
		}
			
	}

}
