package examenes.examen20252;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int minutos;
		int tipoDia;
		int ticketPerdido;
		
		System.out.println("Total minutos: ");
		minutos = teclado.nextInt();
		while (minutos<0) {
			System.out.println("Total minutos: ");
			minutos = teclado.nextInt();
				
		}
		System.out.println("Tipo de Día (1-Laboral, 2-Festivo): ");
		tipoDia=teclado.nextInt();
		while (!(tipoDia==1 || tipoDia==2)) {
			System.out.println("Tipo de Día (1-Laboral, 2-Festivo): ");
			tipoDia=teclado.nextInt();
			
		}
			
		System.out.println("Ticket Perdido (1-Sí, 2-No): ");
		ticketPerdido=teclado.nextInt();
		while (!(ticketPerdido==1 || ticketPerdido==2)) {
			System.out.println("Ticket Perdido (1-Sí, 2-No): ");
			ticketPerdido=teclado.nextInt();
		}
		float baseImponible=0.0f;
		int mediasHoras=0;
		
		
		System.out.println("---RECIBO---");
		System.out.println("Minutos: " + minutos);
		
		if (minutos>30) {
			mediasHoras = minutos / 30;
			if (minutos % 30 != 0) {
				mediasHoras++;  // Añadir una fracción extra si sobran minutos
			}
			
		}
		if (mediasHoras<=4 && mediasHoras>0) {
			System.out.println("Tramo hasta 2 horas: " + mediasHoras + "*1.20 € =" + mediasHoras*1.20);
			baseImponible=mediasHoras*1.20f;
		}
		if (mediasHoras>4) {
			int tramosAdicionales=mediasHoras-4;
			int mediasHorasCaras = mediasHoras-tramosAdicionales;
			System.out.println("Tramo hasta 2 horas: " + mediasHorasCaras + "*1.20 € =" + mediasHorasCaras*1.20);
			System.out.println("Tramo adicional: " + tramosAdicionales + "*1.00 € =" + tramosAdicionales*1.0);
			baseImponible=(mediasHorasCaras)*1.20f + tramosAdicionales*1.00f;  
		}
		System.out.println("Base imponible: " + baseImponible + "€.");
		
		float recargoFestivo=0.0f;
		
		if (tipoDia==2) {
			recargoFestivo=baseImponible*0.1f;
			baseImponible = baseImponible + recargoFestivo;
		}
		System.out.println("Recargo fin de semana: " + recargoFestivo + "€.");
		
		
		if (ticketPerdido==1) {
			baseImponible=baseImponible+20.0f;
			System.out.println("Recargo pérdida: " + 20.0f);
		}else {
			System.out.println("Recargo pérdida: " + 0.0f);
		}
		float importeIVA=(baseImponible + recargoFestivo)*0.21f;
		System.out.println("IVA (21%): " + importeIVA + "€.");
		System.out.println("TOTAL: " + (baseImponible+importeIVA) + "€.");
		
	}

}
