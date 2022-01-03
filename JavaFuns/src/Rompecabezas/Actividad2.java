package Rompecabezas;

import java.util.ArrayList;
import java.util.Collections;

public class Actividad2  {
	
	public static void actividad1() {
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Nancy");
		nombres.add("Jinichi");
		nombres.add("Fujibayashi");
		nombres.add("Momochi");
		nombres.add("Ishiokawa");
		
		//DESORDENAR
		Collections.shuffle(nombres);
		System.out.println(nombres);
		
		//DEVOLVER NOMBRES CON CARACTERES MAYOR A 5
	    for (int i=0;i<nombres.size();i++) {
	    	
	    	//Corregir
	    	if(nombres.size()<=5) {
	    		System.out.println(nombres.get(i));
	    	}else {
	    		
	    	}
	    	
	      }
	  }
}

