package EjerciciosBasicos;

public class Ejercicio5Maximo {

	public static void main(String[] args) {
		//5 - Encontrar el maximo en un arreglo
		
		int[] array;
		array = new int[4];
        
        array[0] = 2;
        array[1] = -5;
        array[2] = -6;
        array[3] = 5;
        
        int mayor;
        mayor = array[0];
        for (int i = 0 ; i < array.length ; i++) {
           if(array[i] > mayor) {
            	mayor = array[i];   	
            }
        }
        System.out.println("El numero mayor es: " + mayor);

	}

}
