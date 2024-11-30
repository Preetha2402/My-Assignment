package List;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		// declare on array
		List<Integer> find = new ArrayList<Integer>();
		
		find.add(1);
		find.add(2);
		find.add(3);
		find.add(4);
		find.add(10);
		find.add(6);
		find.add(8);
		
		find.sort(null);
		
		for (int i = 0; i < find.size()-1; i++) {
			
			if (find.get(i)+1!=find.get(i+1)) {
				
				//print the missing elements
				System.out.println("Missing Elements is"+(find.get(i)+1));
				
			}
		
			
		}
		

	}

}
