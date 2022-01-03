package Rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Actividad3 extends PuzzleJava{
	
	public static void actividad2(){
		
		ArrayList<String> alfabeto = new ArrayList<String>();
		alfabeto.add("a");
		alfabeto.add("b");
		alfabeto.add("c");
		alfabeto.add("d");
		alfabeto.add("e");
		alfabeto.add("f");
		alfabeto.add("g");
		alfabeto.add("h");
		alfabeto.add("i");
		alfabeto.add("j");
		alfabeto.add("k");
		alfabeto.add("l");
		alfabeto.add("m");
		alfabeto.add("n");
		alfabeto.add("o");
		alfabeto.add("p");
		alfabeto.add("q");
		alfabeto.add("r");
		alfabeto.add("s");
		alfabeto.add("t");
		alfabeto.add("u");
		alfabeto.add("v");
		alfabeto.add("w");
		alfabeto.add("x");
		alfabeto.add("y");
		alfabeto.add("z");
		
		//DESORDENAR
		Collections.shuffle(alfabeto);
		System.out.println(alfabeto);
	
		//ULTIMA LETRA
		System.out.println(alfabeto.get(25));
		
		//CORREGIR
		if(alfabeto.equals("a")) {
			System.out.println("Es una vocal");
		}else if(alfabeto.equals("e")){
			System.out.println("Es una vocal");
		}else if(alfabeto.equals("i")){
			System.out.println("Es una vocal");
		}else if(alfabeto.equals("o")){
			System.out.println("Es una vocal");
		}else if(alfabeto.equals("u")){
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es vocal");
		}
		
	}
}
