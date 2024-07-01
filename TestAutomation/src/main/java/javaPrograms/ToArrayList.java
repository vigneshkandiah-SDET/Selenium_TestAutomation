package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ToArrayList {


	public static void main(String[] args) {


		List<String> people=new ArrayList<String>();

		people.add("YazhIniyan");
		people.add("Sachin");
		people.add("Krishwanth");
		people.add("Vimal");
		people.add("Vignesh");
		
		
//		for (String index : people) {
//			
//			System.out.println(index);
//			
//			
//			
//		}
		
		
		List<String> people1=new ArrayList<String>();

		people1.add("YazhIniyan");
		people1.add("Sachin");
		people1.add("Krishwanth");
		people1.add("Vimal");
		people1.add("Vignesh");
		people1.add("ganesh");
		people1.add("murugan");
		//boolean value = people.contains("sachin");
		
		//System.out.println(value);
		
		boolean containsAll = people.containsAll(people1);
		
		System.out.println(containsAll);
		
		
		
//		for (int i = 0; i < people.size(); i++) {
//			
//			System.out.println(people.get(i));
//			
//		}
		
		
//		// Retieve using Array 
//		Object[] array = people.toArray();
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			System.out.println(array[i]);
//			
//		}
		
		
		
		
		
	}

}
