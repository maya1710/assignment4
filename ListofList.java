package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListofList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> LstOfLst=new ArrayList<>(); 	
		
//10,45, 90,45, 23, 90, 44
		
		l1.add(10);
		l1.add(45);
		l1.add(90);
		
		l3.add(10);
		l3.add(45);
		l3.add(90);
		
		
		l2.add(45);
		l2.add(23);
		l2.add(90);
		l2.add(45);
	

		LstOfLst.add((ArrayList<Integer>) l1);
		LstOfLst.add((ArrayList<Integer>) l2);
		LstOfLst.add((ArrayList<Integer>) l3);
		
		
 
	}
}



