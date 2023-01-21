package assignment4;

import java.util.ArrayList;
import java.util.List;

public class ListSelectString {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> values = new ArrayList<>();
		
		//Java, Selenium, TestNG, Git, Github
		
		values.add("Java");
		values.add("Selenium");
		values.add("TestNG");
		values.add("Git");
		values.add("Github");
	
		for (int k = 0, j = values.size() - 1; k < j; k++) 
        {
            values.add(k, values.remove(j));
        }
 
        System.out.println(values);
    }

	}



