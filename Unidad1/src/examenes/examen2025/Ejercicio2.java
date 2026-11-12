package examenes.examen2025;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		float saldo=50.0f;
		float carrito=0.0f;
		int contadorAnadidos = 0,contadorQuitados=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione opción: ");
		System.out.println("1.- Añadir producto al carrito.");
		System.out.println("2.- Eliminar producto al carrito.");
		System.out.println("3.- Finalizar compra.");
		System.out.println("4.- Mostrar estado.");
		System.out.println("5.- Salir.");
		
		int opcionUsuario= teclado.nextInt();
		while(opcionUsuario!=5) {
			
			if (opcionUsuario==1) {
				System.out.println("Precio: ");
				float precioProducto = teclado.nextFloat();
				while(precioProducto<0) {
					System.out.println("Error: Ha introducido un precio negativo.");
					System.out.println("Precio: ");
					precioProducto = teclado.nextFloat();
				}
				carrito=carrito+precioProducto;
				saldo=saldo-precioProducto;
				System.out.println("Producto añadido al carrito.");
				System.out.println("Saldo restante: " + saldo);
				contadorAnadidos++;
				
			}else if (opcionUsuario==2) {
				System.out.println("Precio: ");
				float precioProducto = teclado.nextFloat();
				while(precioProducto<0) {
					System.out.println("Error: Ha introducido un precio negativo.");
					System.out.println("Precio: ");
					precioProducto = teclado.nextFloat();
				}
				carrito=carrito-precioProducto;
				saldo=saldo+precioProducto;
				System.out.println("Producto quitado del carrito.");
				System.out.println("Saldo restante: " + saldo);
				contadorQuitados++;
				
			}else if (opcionUsuario==3) {
				
				if (saldo>=carrito) {
					System.out.println("Compra realizada.");
					System.out.println("Saldo restante: " + saldo);
				}else {
					System.out.println("No se ha podido completar la compra.");
					System.out.println("Saldo insuficiente.");
						
				}
				
			}else if (opcionUsuario==4) {
				System.out.println("Saldo: " + saldo);
				System.out.println("Total carrito: " + carrito);
				System.out.println("Productos añadidos: " + contadorAnadidos);
				System.out.println("Productos quitados: " + contadorQuitados);

			}else {
				System.out.println("Opción no válida.");
			}
			
			System.out.println("Seleccione opción: ");
			System.out.println("1.- Añadir producto al carrito.");
			System.out.println("2.- Eliminar producto al carrito.");
			System.out.println("3.- Finalizar compra.");
			System.out.println("4.- Mostrar estado.");
			System.out.println("5.- Salir.");
			opcionUsuario= teclado.nextInt();
							
		}
		
		
		
	}

}
