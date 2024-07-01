package javaPrograms;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {6,2,3,6,8,2,9};
		
		
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {
				
				if(numbers[i]==numbers[j]) {
					System.out.println(numbers[j]);
					
					
				}
				
			}
			
		}
		
	}

}
