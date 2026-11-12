package examenes.examen20252;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int opcion;
		int saldo = 0;
		Scanner teclado = new Scanner(System.in);
		
		
		/*Validamos que el usuario ingrese una opcion correcta*/
		System.out.println("1)Ingresar 2)Retirar 3)Saldo 4)Salir");
		opcion=teclado.nextInt();
	
		int contadorIngresos=0;
		int contadorRetiros=0;
		int totalIngresos=0;
		int totalRetiros=0;
		boolean continuar=true;
		
		while ((opcion==1 || opcion==2 || opcion==3 || opcion==4) && continuar==true) {
					
			if (opcion == 1) {//Ingresar
				System.out.println("Introduzca cantidad a ingresar: ");
				int cantidadAIngresar = teclado.nextInt();
				if (cantidadAIngresar<0) {
					System.out.println("ERROR: La cantidad  no puede ser negativa.");
				}else {
					saldo = saldo + cantidadAIngresar;
					contadorIngresos++;
					totalIngresos = totalIngresos + cantidadAIngresar;
				}
				
			}else if (opcion == 2) { //Retirar
				System.out.println("Introduzca cantidad a retirar: ");
	
				int cantidadARetirar = teclado.nextInt();
				if (cantidadARetirar<0) {
					System.out.println("ERROR: La cantidad  no puede ser negativa.");
				}else {//Ha introducido una cantidad positiva
					if (cantidadARetirar<=saldo) {
						saldo = saldo - cantidadARetirar;
						contadorRetiros++;
						totalRetiros = totalRetiros - cantidadARetirar;
					}else {
						System.out.println("Saldo insuficiente.");
					}
				}
				
			}else if (opcion == 3) { // Mostrar saldo
				System.out.println("SALDO ACTUAL: " + saldo + "€.");
			}else if (opcion == 4) { //Salir, mostrando resumen de operaciones
				System.out.println("---RESUMEN---");
				System.out.println("Saldo final: " + saldo);
				System.out.println("Ingresos: " + contadorIngresos + "(" + totalIngresos + "€.)");
				System.out.println("Retiradas: " + contadorRetiros + "(" + totalRetiros + "€.)");
				continuar=false;
			
		}
		
			if (continuar==true) {
				System.out.println("1)Ingresar 2)Retirar 3)Saldo 4)Salir");
				opcion=teclado.nextInt();
			}
		}//Fin While
		
		System.out.println("PROGRAMA TERMINADO.");
		
		
		
	}

}
