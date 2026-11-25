package examenunidad22026recuperacion.ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {

		String[] nombres = {"Teclado", "Ratón", "Monitor"};
		
		int[] precios = {20, 10, 150};
		
		int[][] ventas = {
		    {3, 4, 2, 1, 5, 0, 2},
		    {8, 7, 5, 3, 6, 4, 2},
		    {1, 0, 2, 1, 0, 1, 0}
		};
		
		String[] estados = {"", "", ""};
		
		String[] dias = {
		"Lunes", "Martes", "Miércoles", "Jueves",
		"Viernes", "Sábado", "Domingo"
		};
		
		
		for (int i=0;i<nombres.length;i++) {
			System.out.println("Nombre: " + nombres[i]);
			System.out.println("Precio: " + precios[i]);
			int cantidadVendida=0;
			for (int j=0;j<ventas[i].length;j++) {
				System.out.println(dias[j] + ":" + ventas[i][j]);
				cantidadVendida=cantidadVendida + ventas[i][j];
			}
			System.out.println("Total de Unidades: " + cantidadVendida);
			System.out.println("Importe total: " + cantidadVendida*precios[i]);
			if (cantidadVendida>=20) {
				estados[i]="ALTA";
			}else {
				estados[i]="BAJA";
			}
			System.out.println("Estado de ventas: " + estados[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
