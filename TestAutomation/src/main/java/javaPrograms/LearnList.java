package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
	public static void main(String[] args) {
		
		
		List<String> names=new ArrayList<String>();
		
		names.add("Vignesh");
		
		names.add("Suresh");
		
		names.add("Kani");
		
		names.add("Vimal");
		
		
		
		
		//System.out.println(names);
		
		
		List<String> names1=new ArrayList<String>();
		
		names1.add("YazhIniyan");
		names1.add("Sachin");
		names1.add("Krishwanth");
		names1.add("Vimal");
		names1.add("Vignesh");
		names1.add("Ganesh");
		names1.add("Murugan");
		//System.out.println("Before Remove :"+names1);
		
		
		//names1.removeAll(names);
		
		//System.out.println("After Remove :"+ names1);
		
		//System.out.println();
//		System.out.println(names1);
//		
//		names1.addAll(names);
//		
//		System.out.println(names1);
//		
//		names.add(1, "Keerthana");
//		
//		System.out.println(names);
//		
//		names.add(5, "Abi");
//		
//		System.out.println(names);
//		
//		String index1 = names.get(1);
//		
//		System.out.println(index1);
//		
//		names.remove(6);
//		
//		System.out.println(names);
		
		//names1.clear();
		
		
		System.out.println(names1);
		
		int size = names1.size();
		
		System.out.println(size);
		
		
		
	}

}
