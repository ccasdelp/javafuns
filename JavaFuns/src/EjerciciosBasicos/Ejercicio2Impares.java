package EjerciciosBasicos;

public class Ejercicio2Impares {

	public static void main(String[] args) {
		//2 - Imprimir los Números Impares Entre 1 - 255
			
		for(int i=0;i<=254;i++) {
			if (i%2==0) {
			System.out.println("Los impares son: " + (i+1));
			}
		}
		
	}
}
