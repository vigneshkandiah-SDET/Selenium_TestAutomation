package javaPrograms;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		
//		try {
//			int c=a/b;
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//			
//			
//		}
		
		try {
			int c = a / b;
		} 
		catch(Exception e){
			
			System.out.println("The additon is having an issue");
		}
		finally {
			System.out.println("There is an issue with this Additon");
		}
		System.out.println("vignesh");
		
	}

}
