package EjerciciosBasicos;

public class Ejercicio11MinMaxPro {

	public static void main(String[] args) {
		// Ejercicio 11 - Mínimo, Máximo y Promedio
		
		int[] array;
		array = new int[4];
        array[0] = 1;
        array[1] = -5;
        array[2] = 10;
        array[3] = -2;
        
        //MINIMO, MAXIMO
        int mayor;
        int menor;
        mayor = array[0];
        menor = array[0];
        
        for (int i = 0 ; i < array.length ; i++) {
           if(array[i] > mayor) {
            	mayor = array[i];
            }else if(array[i]<menor) {
            	menor = array[i];	
            }
        }
        
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
        
        //PROMEDIO
        
        double tamano = array.length;
        
        int suma = 0;
        for (int i = 0 ; i < array.length ; i++) {
            suma += array[i];
        }
        double promedio = 0;
        promedio = suma / tamano;
        System.out.println("El promedio del arreglo es: " + promedio);
        
        //AGREG

	}

}
