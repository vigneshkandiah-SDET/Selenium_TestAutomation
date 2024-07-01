package javaPrograms;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
	
		
		int[] numbers= {2,3,2,4,5,4,6,7,8,5};
		
		int length = numbers.length;
		
		System.out.println(length);
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {
				
				
				if(numbers[i]==numbers[j]) {
					
					System.out.println(numbers[i]);
				}
				
			}
			
			
			
		}
		
		
		

	}

}
