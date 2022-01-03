package EjerciciosBasicos;

import java.util.Arrays;

public class Ejercicio10EliminarNumerosNegativos {

	public static void main(String[] args) {
	    int[] arreglo = {1,5,10,-2};
	    System.out.println(Arrays.toString(removeNegativeNumbers(arreglo)));
	}
	
	public static int[] removeNegativeNumbers(int[] numero) {
	    int[] salida = new int[numero.length];
	    int j = 0;
	    for(int i = 0; i < numero.length; i++) {
	       if(numero[i] >= 0) {
	    	   salida[j++] = numero[i];
	       }
	    }
	    return Arrays.copyOfRange(salida, 0, j);
	}
}
