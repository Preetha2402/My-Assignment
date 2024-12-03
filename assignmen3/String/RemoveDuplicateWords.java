package String;


public class RemoveDuplicateWords {

	public static void main(String[] args) {
	
		String text = "We learn Java basics as part of Java session in java week1";
		
		//initialize a variable 'count' for each word
		int count = 0;
		
		//split into the array words
		 String[] learn = text.split(" ");
		
		//iterate the array to find duplicates
		for (int i = 0; i < learn.length; i++) {
			for (int j = i+1; j < learn.length; j++) {
				
		//check the duplicate words
			if (learn[i].equalsIgnoreCase(learn[j])) {
				learn[j] = " ";
				count++;
				
				
				
			}	
				
			}
			
		}
		if (count>0) {
			System.out.println("Count the duplicate numbers = "+count);
			System.out.println("modified words array : " );
			
			for (int i = 0; i < learn.length; i++) 
				System.out.println(learn[i]+ " ");
			}
			else {
				System.out.println("No duplicates words found");
				System.out.println("Original text: " + text);
				
			}
			
					
					
				}
				
			}
			
		
		
		
		
			
		
		
		

	


