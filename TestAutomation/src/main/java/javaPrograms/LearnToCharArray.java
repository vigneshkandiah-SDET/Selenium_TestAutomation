package javaPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnToCharArray {

	public static void main(String[] args) {
		
		
//		String companyName="google";
//		
//		
//		char[] charArray = companyName.toCharArray();
//		
//		for (int i = 0; i < charArray.length; i++) {
//			
//			System.out.println(charArray[i]);
//			
//		}
		
		
		
		int number=57213573;
		
		//57213
		
		String value = Integer.toString(number);
		
		char[] numarray = value.toCharArray();
		
		
		
		Set<Character> set= new LinkedHashSet<Character>();
		
		for (int i = 0; i < numarray.length; i++)
		{
			set.add(numarray[i]);
			
		}
		
		System.out.println(set);
	}

}
