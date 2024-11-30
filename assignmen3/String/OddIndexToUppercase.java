package String;


public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		//given string
		String test = "changeme";
		
		//covert the given string
		char[]odd = test.toCharArray();
		
		//iterate the array
		for (int i = 0; i < odd.length; i++) {
			
		//find the odd index
		if (i % 2 == 1) {
			
			//change the char to uppercase in if index
			System.out.println(Character.isUpperCase(odd[i]));}
		
		else {
			System.out.println(odd[i]);
		}
			
			
			
		}
			
		}
			
		
		
		

	}


