package basicos;
import java.util.Scanner;

public class Ejercicio639bis {

	public static void main(String[] args) {

		byte lado;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca lado: ");
		lado = teclado.nextByte();
		
		for (int i=1;i<=lado;i++) {
					
			if (i==1 || i==lado) {
				for (int j=1;j<=lado;j++){
					System.out.print(" * ");
				}
				System.out.println();
			}else {
				//imprimir un asterisco
				System.out.print(" * ");
				//imprimir un numero de espacios en blanco (lado - 2)
				for (int z=1;z<=lado-2;z++) {
					System.out.print("   ");
				}
				//imprimir otro asterisco
				System.out.print(" * ");
				System.out.println();
				
			}
			
		}

	}
}