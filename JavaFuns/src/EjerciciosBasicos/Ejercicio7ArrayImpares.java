package EjerciciosBasicos;

public class Ejercicio7ArrayImpares {

	public static void main(String[] args) {
		//7 - Arrreglo con numeros impares
		
		//??
		int arreglo[] = new int [255];
		for(int i=0;i<=254;i++) {
			if (i%2==0) {
			arreglo[i] = (int)(Math.incrementExact(i));
			System.out.println(arreglo[i]);
			}
		}
	}

}
