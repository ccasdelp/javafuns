
public class FizzBuzz {

	public static void main(String[] args) {
		// Actividad 2 FizzBuzz	
		
		for (int i=1; i<=99; i++) {
			System.out.println(fizzBuzz(i));
		}	
	}
	
	public static String fizzBuzz(int numero) {
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			return "FizzBuzz";
		} else if(numero  % 5 == 0) {
			return "Buzz";
		}else if(numero  % 3 == 0) {
			return "Fizz";
		}else {
			return String.valueOf(numero);
		}
	}
	
}
