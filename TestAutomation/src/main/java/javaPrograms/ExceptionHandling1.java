package javaPrograms;

public class ExceptionHandling1 {
	
	public static void main(String[] args) {
		
		
		int numbers[]= {1,2,3,4,5,6};
		
		try {
			System.out.println(numbers[6]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The Index a trying to print is not present");
		}
		
		
	}

}
