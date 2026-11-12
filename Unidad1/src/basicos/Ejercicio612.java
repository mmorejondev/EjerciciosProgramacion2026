package basicos;

public class Ejercicio612 {

	public static void main(String[] args) {

		int contador=20;
		
		while(contador>=2) {
			
			if(contador%2==0){//es par
				System.out.print(contador + " ");
			}
			contador = contador - 1; //contador--;
		}
		// Otra forma de resolver el mismo problema
		
		System.out.println();
		contador=20;
		while (contador>=2) {
			System.out.print(contador + " ");
			contador = contador - 2; //contador-=2;
		}
		
		
		
		
		
	}

}
