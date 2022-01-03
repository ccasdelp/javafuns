package EjerciciosBasicos;

public class Ejercicio6Promedio {

	public static void main(String[] args) {
		//6 - Obtener el Promedio
		
		int[] array;
		array = new int[4];
        
        array[0] = 2;
        array[1] = 5;
        array[2] = 6;
        array[3] = 5;
        
        double tamano = array.length;
        
        int suma = 0;
        for (int i = 0 ; i < array.length ; i++) {
            suma += array[i];
        }
        
        System.out.println(suma);
        double promedio = 0;
        promedio = suma / tamano;
        System.out.println("El promedio del arreglo es: " + promedio);

	}

}
