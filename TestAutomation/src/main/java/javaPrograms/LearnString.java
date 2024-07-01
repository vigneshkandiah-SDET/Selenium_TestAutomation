package javaPrograms;

public class LearnString {
	
	
	public static void main(String[] args) {
		
		//1.Using String Literal
		
		String name="vi";
		
		String people="Vignesh";
		
		//2.Using Object or Instantiation
		
		String name1= new String("Kanimozhi");
		
		
		int length = name.length();
		
		System.out.println(length);
		
		boolean equals = name.equals(people);
		
		System.out.println(equals);
		
		
		boolean equalsIgnoreCase = name.equalsIgnoreCase(people);
		
		System.out.println(equalsIgnoreCase);
		

		boolean contains = people.contains(name);
		
		System.out.println(contains);
		
		
		
		
		
	}

}
