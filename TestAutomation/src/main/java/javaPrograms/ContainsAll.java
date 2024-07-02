package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {
	
	public static void main(String[] args) {
		
		
		List<String> people=new ArrayList<String>();

		people.add("YazhIniyan");
		people.add("Sachin");
		people.add("Krishwanth");
		people.add("Vimal Raj");
		people.add("VigneshK");
		
		

		
		
		List<String> names=new ArrayList<String>();

		names.add("YazhIniyan");
		names.add("Sachin");
		names.add("Krishwanth");
		names.add("Vimal");
		names.add("Vignesh");
		names.add("ganesh");
		names.add("murugan");
		
		boolean value = people.containsAll(names);
		
		System.out.println(value);
	}

}
