package test;

public class ConditionasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 65;
		
		if(age>=18) {
			System.out.println("I`m eligible for working");
			 if( age>64 ) {
					System.out.println("it`s to late try in another life )) ");
				}
		} else if (age == 17) {
		System.out.println("try next year");
		} else { 	
			System.out.println("You are not eligible for working");
		} 
		
		
		
	}

}
