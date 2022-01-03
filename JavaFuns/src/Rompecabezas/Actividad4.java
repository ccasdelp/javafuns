package Rompecabezas;

public class Actividad4 extends PuzzleJava{
	
	public static void actividad3() {
		
		int generador[] = new int [10];
		
		for(int i=0;i<=9;i++) {
			generador[i] = (int)(Math.random()*45+55);
			
			System.out.println(generador[i]);
	
		}
	}

}
