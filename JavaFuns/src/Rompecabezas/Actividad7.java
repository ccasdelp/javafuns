package Rompecabezas;

import java.util.Random;

public class Actividad7 {
	
	public static void actividad6() {
		
		String caracteres = "abcdefghijklmnopqrstuvwxyz";
		String cadenaAleatoria = "";
		int length = 5;
		
		Random random = new Random();
		char[] texto = new char[10];
		for(int i = 0; i < length; i++) {
			texto[i] = caracteres.charAt(random.nextInt(caracteres.length()));			
		}
		//
		for(int x=0;x<texto.length;x++) {
			cadenaAleatoria += texto[x];
			System.out.println(cadenaAleatoria+texto[x]);
		}
	}
			
}
