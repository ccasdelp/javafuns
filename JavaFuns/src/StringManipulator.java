public class StringManipulator {

	public static void main(String[] args) {
		//trimAndConcat
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str);
		
		
		//getIndexOrNull
		StringManipulator manipulator1 = new StringManipulator();
		char letter = 'n';
		int a = manipulator.getIndexOrNull("NTT Data", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		
		System.out.println(a); // 0
		System.out.println(b); // 7
		System.out.println(c); // -1
	
		
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";

		int d = manipulator.getIndexOrNull(word, subString);
		int e = manipulator.getIndexOrNull(word, notSubString);

		System.out.println(d); // 2
		System.out.println(e); // -1
		
		
		//concatSubstring
		StringManipulator manipulator3 = new StringManipulator();
		String word1 = manipulator3.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word1); // olmundo

		
	}
	
	
	//METODOS
	
	
	//trimAndConcat
	String trimAndConcat(String string, String string2) {
		String trim = string.trim() + string2.trim();
		return trim;	
	}
	
	//getIndexOrNull
	int getIndexOrNull(String string, char Char) {
		int index = string.indexOf(Char);
		return index;
	}
	
	//getIndexOrNull2
	int getIndexOrNull(String string1, String string2) {
		int index = string1.indexOf(string2);
		return index;
	}
	
	//concatSubstring
	String concatSubstring(String string1, int Int1, int Int2, String string2) {	
		String substring = string1.substring(Int1,Int2);
		String concatenar = substring.concat(string2);
		return concatenar;
	}
	
}