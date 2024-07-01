package javaPrograms;

public class Exceptions {

	public static void main(String[] args) {
		
		
		int[] numbers= {1,2,3,4,5};
		
		try {
			System.out.println(numbers[5]);
		} catch (ArithmeticException e) {
			
			System.out.println(e);
			
			System.out.println("The First catch Block");
			
		}catch(ArrayIndexOutOfBoundsException a){
			
			System.out.println("The second catch Block");
			
			
		}catch(Exception d) {
			
			System.out.println("array");
			
			
		}finally {
			
			System.out.println("done");
		}

	}

}
