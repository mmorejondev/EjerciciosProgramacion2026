package examenes.examen2025;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Distancia: ");
		int distancia = teclado.nextInt();
		while(distancia<0) {
			System.out.println("Distancia: ");
			distancia = teclado.nextInt();
		}
		System.out.println("Tipo: (1 - Adulto, 2 - Estudiante, 3 - Jubilado):");
		int tipo = teclado.nextInt();
		while (!(tipo==1 || tipo==2 || tipo==3)) {
			System.out.println("Tipo: (1 - Adulto, 2 - Estudiante, 3 - Jubilado):");
			tipo = teclado.nextInt();
				
		}
		
		System.out.println("¿Equipaje especial?: (1-Sí,2-No)");
		int equipaje = teclado.nextInt();
		while(!(equipaje == 1 || equipaje ==2)) {
			System.out.println("¿Equipaje especial?: (1-Sí,2-No)");
			equipaje = teclado.nextInt();
		}
		
		
		float precioViaje = 0.0f;
		System.out.println("-----RECIBO-----");
		if (distancia <= 10) {
			System.out.println("Base:2 €");
			precioViaje=2.0f;
		}else {
			System.out.println("Base:2 +(" + (distancia-10) + "* 0.15€) = " + (2.0 + (distancia-10)*0.15) +"€.");
			precioViaje=(2.0f + (distancia-10)*0.15f);
		}
		float descuento=0.0f;
		if (tipo == 2) {//Estudiantes
			descuento = precioViaje*0.2f;
			precioViaje = precioViaje-descuento;
			System.out.println("Descuento (20%): " + "-" + descuento);
			
		}else if (tipo == 3) {//Jubilados
			descuento = precioViaje*0.3f;
			precioViaje = precioViaje-descuento;
			System.out.println("Descuento (30%): " + "-" + descuento);

		}
		
		if (equipaje==1) {
			System.out.println("Equipaje: +5 €");
			precioViaje=precioViaje+5.0f;
		}else {
			System.out.println("Equipaje: +0 €");
		}
		float baseImponible=precioViaje;
		System.out.println("Base imponible: " + baseImponible + "€.");
		float importeIva = baseImponible*0.21f;
		System.out.println("IVA: " + importeIva + "€.");
		System.out.println("TOTAL: " + (baseImponible + importeIva) + "€.");
	
		
		
		
	}
}
