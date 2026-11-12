package basicos;
import java.util.Scanner;

public class Ejercicio638 {

	public static void main(String[] args) {

		long numero1,numero2;
		int contadorPrimos=0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca primer número: ");
		numero1 = teclado.nextLong();
		System.out.println("Introduzca segundo número: ");
		numero2 = teclado.nextLong();
		
		for (long i=numero1;i<=numero2;i++) {
					
			int contadorDivisores=0;
			
			for (long j=1;j<=i;j++){
				if (i%j==0) {
					contadorDivisores++;
				}
			}
			
			if (contadorDivisores==2) {
				contadorPrimos++;
			}
		}
		System.out.println("Entre " + numero1 + " y " + numero2 + " hay " + contadorPrimos + " números primos.");
		teclado.close();
	}

}
