package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> values = new ArrayList<>();
		
		Set<String> value1 = new HashSet();
		
		
		// Git, Github, GitLab,GitBash, Selenium, Java, Maven
		
		values.add("Java");
		values.add("TestNG");
		values.add("Java");
		values.add("Maven");
		
		value1 =values.stream().distinct().collect(Collectors.toSet());
		System.out.println(value1.size());
		System.out.println(values.size());
 
	}
}



