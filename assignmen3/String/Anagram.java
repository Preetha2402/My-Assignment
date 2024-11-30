package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "postss";
		
		//check if length two strings are equal
		
		if (text1.length() == text2.length()) {
			//if equal
			
			//convert both the strings to char array
			
			char [] txt1 = text1.toCharArray();
			char [] txt2 = text2.toCharArray();
			
			//sort the two chars arrays
			Arrays.sort(txt1);
			Arrays.sort(txt2);
			
			//check if arrays are equal
			if (Arrays.equals(txt1, txt2)) {
				System.out.println("The given strings are Anagram");}
				
					else {
						System.out.println("The given strings are not an Anagram");
						
					}
			}
			
			
				
			}
			
	
		
		
		

	}


