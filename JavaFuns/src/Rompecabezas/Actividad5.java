package Rompecabezas;

import java.util.Arrays;

public class Actividad5 extends PuzzleJava {
	
	public static void actividad4() {
		
		//GENERAR ARRAY ENTRE 55 Y 100
		int[] generador = new int [10];
		for(int i=0;i<=9;i++) {
			generador[i] = (int)(Math.random()*45+55);
			System.out.println(generador[i]);	
		}
		Arrays.sort(generador);
		for (int numero:generador)
			  System.out.println("orden: " + numero);
	}

}
