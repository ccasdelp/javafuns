package Rompecabezas;

import java.util.ArrayList;
import java.util.Collections;

public class Actividad1 extends PuzzleJava{
	
	//SUMA Y MAYOR ARRAYLIST
	
	public static void actividad0() {
		
		ArrayList<Integer> valores = new ArrayList<Integer>();
		valores.add(3);
		valores.add(5);
		valores.add(1);
		valores.add(2);
		valores.add(7);
		valores.add(9);
		valores.add(8);
        valores.add(13);
        valores.add(25);
        valores.add(32);
       
        //SUMA 
        int sum = 0;
        for(int i = 0; i < valores.size(); i++) {
            sum += valores.get(i);}
        System.out.println(sum);
 
        //MAYOR
        System.out.println(Collections.max(valores));
	}

}
