package programacionmodular;

public class Ejercicio836 {

	public static float calcularPromedio(float[] calificaciones) {
		
		float sumaCalificaciones=0.0f;
		float media=0.0f;
		
		for (int i=0;i<calificaciones.length;i++) {
			sumaCalificaciones = sumaCalificaciones + calificaciones[i];
		}
		media = sumaCalificaciones/calificaciones.length;
		
		return media;
	}
	public static void main(String[] args) {

		float [] calificaciones = {7.2f,5.0f,8.3f,4.5f};
		
		float promedio = calcularPromedio(calificaciones);
				
		System.out.println("La nota media es: " + promedio);		
		
	}

	

}
