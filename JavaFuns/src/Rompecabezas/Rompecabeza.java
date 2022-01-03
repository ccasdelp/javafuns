package Rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Rompecabeza {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(5);
        numeros.add(4);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        
        Collections.shuffle(numeros);
        System.out.println(numeros); // [5, 4, 3, 2, 1]
        Collections.sort(numeros);
        System.out.println(numeros); // [1, 2, 3, 4, 5]

        Random r = new Random();
        System.out.println(r.nextInt()); // Sin l�mites
        System.out.println(r.nextInt(5)); // Con l�mites entre 0 y 5
        
	}

}
