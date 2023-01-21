package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintElement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> values = new ArrayList<>();
		
//10,45, 90,45, 23, 90, 44
		
		values.add(10);
		values.add(45);
		values.add(90);
		values.add(45);
		values.add(23);
		values.add(90);
		values.add(45);
	
//second element
		System.out.println(values.get(1));
		System.out.println(values.get(values.size()-2));
 
	}
}



