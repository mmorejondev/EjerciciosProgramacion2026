package ejerciciospaquetes.ejercicio911;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Introduzca su nombre: ");
		String nombre = EntradaSalida.leerCadena();
		System.out.println("Su nombre es: ");
		EntradaSalida.escribir(nombre);
		System.out.println("Introduzca su edad: ");
		int edad = EntradaSalida.leerEntero();
		System.out.print("Su edad es: ");
		EntradaSalida.escribirSinSalto(edad);
		

		
		
	}

}
