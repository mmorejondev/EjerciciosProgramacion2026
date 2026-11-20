package examenunidad22025.ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		String[] alumnos = {"Ana", "Luis", "María"};

		int[][] notas = {
		    {7, 6, 4, 8, 5},
		    {5, 5, 5, 5, 5},
		    {3, 8, 2, 4, 1}
		};

		String[] modulos = {
		    "Programación",
		    "Lenguajes de Marcas",
		    "Entornos de Desarrollo",
		    "Bases de Datos",
		    "Sistemas Informáticos"
		};
		
		String [] aprobados = new String[alumnos.length];
		float [] medias = new float[alumnos.length];
		//Calcular la media
		
		for (int i=0;i<notas.length;i++) {
			float sumaNotas = 0.0f;
			float media = 0.0f;
			for (int j=0;j<notas[i].length;j++) {
				sumaNotas = sumaNotas + notas[i][j];
			}
			media = sumaNotas/notas[i].length;
			medias[i]=media;
		}
		
		/* 	Comprobar si todos los módulos de un alumno están aprobados y, por lo tanto,
		   	promociona. Insertar "SI" o "NO" en el array de aprobados en la posición 
			correspondiente */
		for (int i=0;i<notas.length;i++) {
			boolean promociona=true;
			
			for (int j=0;j<notas[i].length;j++) {
				if (notas[i][j]<5) {
					promociona=false;
				}
			}
			if (promociona) {
				aprobados[i] = "SI";
			}else {
				aprobados[i] = "NO"; 
			}
		}
		
		for (int i=0;i<alumnos.length;i++) {
			System.out.println("Alumno: " + alumnos[i]);
			
			for (int j=0;j<modulos.length;j++) {
				System.out.println(modulos[j] + ": " + notas[i][j]);
			}
			System.out.println("Media: " + medias[i]);
			System.out.println("Promociona: " + aprobados[i]);
			
		}
		
		
	}

}
