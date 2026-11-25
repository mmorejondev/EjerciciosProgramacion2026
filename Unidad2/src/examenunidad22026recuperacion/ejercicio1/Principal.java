package examenunidad22026recuperacion.ejercicio1;

public class Principal {

	public static void main(String[] args) {

		String[] salas = {    
				"Sala Azul",   
				"Sala Verde", 
				"Sala Naranja",
				"Sala Biblioteca",
				"Sala Multimedia"};
		
		boolean [] reservadas = {false,false,false,false,false};
		
		int opcion=Funcionalidades.mostrarMenu();
		
		while(opcion!=5) {
			if (opcion==1) {
				Funcionalidades.mostrarSalas(salas, reservadas);
				opcion=Funcionalidades.mostrarMenu();
			}else if (opcion==2) {
				int sala=Funcionalidades.pedirIndiceSala();
				if (Funcionalidades.reservarSala(reservadas, sala)) {
					System.out.println("Sala reservada correctamente.");
				}else {
					System.out.println("Error: la sala ya se encuentra reservada.");
				}
				opcion=Funcionalidades.mostrarMenu();

				
			}else if (opcion==3) {
				int sala=Funcionalidades.pedirIndiceSala();
				if (Funcionalidades.liberarSala(reservadas, sala)) {
					System.out.println("Sala liberada correctamente.");
				}else {
					System.out.println("Error: la sala ya se encuentra libre.");
				}
				opcion=Funcionalidades.mostrarMenu();

				
			}else if (opcion == 4) {
				System.out.println("Cantidad de salas reservadas: " + Funcionalidades.contarReservadas(reservadas));
				opcion=Funcionalidades.mostrarMenu();

			}
		}
		System.out.println("Programa terminado.");
		
		
		
	}

}
