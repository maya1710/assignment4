package assignment4;

import java.util.ArrayList;
import java.util.List;

public class ListStringRetrive {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> values = new ArrayList<>();
		
		
		// Git, Github, GitLab,GitBash, Selenium, Java, Maven
		
	
		values.add("Git");
		values.add("Github");
		values.add("GitLab");
		values.add("GitBash");
		values.add("Selenium");
		values.add("Java");
		values.add("Maven");
		
		List<String> valueStartWithG = new ArrayList<>();
		
		for(int i=0; i<values.size()-1; i++)
		{
			
			if(values.get(i).startsWith("Git"))
			{
				values.remove(i);
				System.out.println("its removal logic"+values.remove(i));
			}
			
		}
		
		System.out.println("values size"+values.size());
		System.out.println(values.get(0));

 
	}
}



