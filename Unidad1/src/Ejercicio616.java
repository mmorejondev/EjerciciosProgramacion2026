import java.util.Scanner;

public class Ejercicio616 {

	public static void main(String[] args) {

		int usuario, pass;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca usuario:");
		usuario=teclado.nextInt();
		System.out.println("Introduzca password:");
		pass=teclado.nextInt();
		
		//valido usuario 1809 y pass 1234
		while (!(usuario==1809 && pass==1234)) { // equivalente a (usuario!=1809 || pass!=1234)
			
			System.out.println("USUARIO Y/O CONTRASEÑA INCORRECTOS.");
			System.out.println("Introduzca usuario:");
			usuario=teclado.nextInt();
			System.out.println("Introduzca password:");
			pass=teclado.nextInt();
						
		}
		System.out.println("ACCESO PERMITIDO.");
		
		
	}

}
