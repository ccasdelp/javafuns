package EjerciciosBasicos;

public class Ejercicio4RecorrerArray {

	public static void main(String[] args) {
		
		//4 - Recorrer un arreglo
		
		int[] array;
		array = new int[4];
        
        array[0] = 2;
        array[1] = 5;
        array[2] = 6;
        array[3] = 5;
        
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println(array[i]);
        }

	}

}
