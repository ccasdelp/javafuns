package Rompecabezas;

import java.util.Random;

public class Actividad6 {
	
	public static void actividad5() {
		
		String caracteres = "abcdefghijklmnopqrstuvwxyz";
		String cadenaAleatoria = "";
		int length = 5;
		
		Random random = new Random();
		
		char[] texto = new char[length];
		
		for(int i = 0; i < length; i++) {
			texto[i] = caracteres.charAt(random.nextInt(caracteres.length()));		
		}
		for(int i=0;i<texto.length;i++) {
			cadenaAleatoria += texto[i];
		}
		System.out.println(cadenaAleatoria);
	}

}
