public class Main {
	
	/* Cualquier línea de código en Java debe de estar dentro de un class, esta class debería estar siempre con la primera letra en mayúsculas
	 * , Main, el nombre del archivo .java debe de coincidir con el nombre del class.*/

	 // Todo aquel código existente en main va a ser ejecutado.
	
	public static void suma( int num1, int num2, int num3) {
		int resultado = num1 + num2 + num3;
		System.out.println(String.valueOf(resultado)); // Conversión del valor int a string del resultado para hacer println
	}
	
	public static class Coche {
		static int puertas = 4; // Número de puertas
		void addPuertas(int numPuertas) { // Función cuyo argumento es el número de puertas que se añadirán
			puertas += numPuertas;
			System.out.println(String.valueOf(Coche.puertas)); // Cuando llamemos esta función se printeará el numero de puertas actuales del coche
		}
	}
	
	public static void main(String[] args) {
		suma(5,10,20); // Invocación de la función previamente hecha
		Coche deportivo = new Coche(); // Creación de la instancia del objeto Coche
		deportivo.addPuertas(1); // Llamada de la función .addPuertas
	}	
}



