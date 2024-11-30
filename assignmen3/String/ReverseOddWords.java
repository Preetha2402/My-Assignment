package String;

public class ReverseOddWords {

	public static void main(String[] args) {
	
		String model = " I am a software tester";
		
		//split the array
		String test1[] = model.split(" ");
		
		//Traverse through the words using loop
		for (int i = 0; i < test1.length; i++) {
			
			//find the odd index
			if (i % 2==1) {
				
				//convert the string array
				char[] revwor = test1[i].toCharArray();
				
				//print the even position using another loop
				 for (int j = revwor.length-1; j>=0; j--) {
					 System.out.print(revwor[j]);
				 }
					 System.out.print(" ");
			}
			else {
			
			}
						System.out.print(test1[i] +" ");
						
					
					
		}
	}
	
	
}
				
			
			
		
		
		

	


