package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num =1;
		
		
		while(num<=20) {
			
			if(num==6) {
			num = num+1;
			continue;
			}
			
			System.out.println(num);
			num = num+1;
		    }
		System.out.println("After while loop");
		}
	}



