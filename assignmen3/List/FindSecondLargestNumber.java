package List;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		//declare an array
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		
		//sort & print the list
		list.sort(null);
		
		//use the get method to print the second largest number
		int j = list.get(4);
		System.out.println("The Second largest number in the list of array is:"+j);

	}

}
