import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca temperatura en Celsius: ");
		float tempCelsius = teclado.nextFloat();
		
		float tempFahrenheit = 9*tempCelsius/5 + 32;
		
		System.out.println("La temperatura en Fahrenheit es de: " + tempFahrenheit);
		
	}

}
