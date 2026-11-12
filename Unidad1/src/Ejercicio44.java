import java.util.Scanner;

public class Ejercicio44 {

	public static void main(String[] args) 
	{//Algoritmo
	
	 	Scanner teclado= new Scanner(System.in);
 	 	
    	System.out.print( "Introduzca el primer número: " );
    	int primerNumero = teclado.nextInt();
    	System.out.print( "Introduzca el segundo número: " );
    	int segundoNumero = teclado.nextInt();
 
    	System.out.print( "Su suma es: " );
    	System.out.println( primerNumero+segundoNumero );
    	System.out.print( "Su resta es: " );
    	System.out.println( primerNumero-segundoNumero );
    	System.out.print( "Su producto es: " );
    	System.out.println( primerNumero*segundoNumero );
    	System.out.print( "Su división es: " );
    	System.out.println( primerNumero/segundoNumero );
	
	}//FinAlgoritmo

}
