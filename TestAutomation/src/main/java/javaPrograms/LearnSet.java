package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		
		Set<String> set=new TreeSet<String>();
		
		set.add("arun");
		
		
		set.add("babu");
		
		set.add("xaron");
		
		set.add("cathrin");
		
		set.add("sathya");
		
		System.out.println(set);
		
		List<String> list= new ArrayList<String>(set);
		
//		for (String text : list) {
//			
//			System.out.println(text);
//			
//		}
		
		String string = list.get(2);
		
		System.out.println(string);
		
		
		
		

	}

}
