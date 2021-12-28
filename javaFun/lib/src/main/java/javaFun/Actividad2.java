package Rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Actividad2 extends PuzzleJava {
	
	public static void actividad1() {
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Nancy");
		nombres.add("Jinichi");
		nombres.add("Fujibayashi");
		nombres.add("Momochi");
		nombres.add("Ishikawa");
		
		//DESORDENAR
		Collections.shuffle(nombres);
		System.out.println(nombres);
		
		//DEVOLVER NOMBRES CON CARACTERES MAYOR Aaaaaa 5
	}
}