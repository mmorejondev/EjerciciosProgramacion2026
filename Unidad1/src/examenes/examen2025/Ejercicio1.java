package examenes.examen2025;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int cantidadTemperaturas;
		int menores0 = 0,mayores30=0,entre0y30=0;
		int temperaturaMaxima,temperaturaMinima;
		int posicionMinima = 0,posicionMaxima = 0;
		int sumaTemperaturas=0;
		double media;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca cantidad de temperaturas: ");
		cantidadTemperaturas = teclado.nextInt();
		
		if (cantidadTemperaturas>0) {
			//hacemos cosas porque la cantidad es positiva
			temperaturaMinima=Integer.MAX_VALUE;
			temperaturaMaxima=Integer.MIN_VALUE;
			
			for (int i=0;i<cantidadTemperaturas;i++) {
				//Pedimos cada una de las temperaturas
				System.out.println("t" + (i+1) + ":");
				int temperatura=teclado.nextInt();
				sumaTemperaturas=sumaTemperaturas+temperatura;
				
				if (temperatura<temperaturaMinima) {
					temperaturaMinima=temperatura;
					posicionMinima=i+1;
				}
				if (temperatura>temperaturaMaxima) {
					temperaturaMaxima=temperatura;
					posicionMaxima=i+1;
				}
						
				
				if (temperatura<0) {
					menores0++;
				}else if (temperatura>30){
					mayores30++;
				}else if (temperatura >=0 && temperatura <=30) {
					entre0y30++;
				}
			}
			
			media = (float)sumaTemperaturas/cantidadTemperaturas;
			System.out.println(">30:" + mayores30 + ", <0:" + menores0 +", entre 0 y 30:" + entre0y30 );
			System.out.println("Máxima: " + temperaturaMaxima + " (posición " + posicionMaxima + ")");
			System.out.println("Mínima: " + temperaturaMinima + " (posición " + posicionMinima + ")");
			System.out.println("Suma total: " + sumaTemperaturas);
			System.out.println("Media: " + media);


		}else {
			System.out.println("Programa terminado. Cantidad de temperaturas no puede ser negativa.");
		}
		
		
		
		
		
	}

}
