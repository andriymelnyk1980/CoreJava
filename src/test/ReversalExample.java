package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Clean World Grenn World";
	
		String result = "";
		
		for (int index= str.length() -1; index>=0;index--) {
			
			char ch = str.charAt(index);
			result= result + ch; 
			
			}
		
		System.out.println ("The Vowel count is " + result);
		
		int num = 456789;
		
		int res = 0;
		while (num>0) {
		
		int rem = num%10; //9
		
		res = res*10 + rem;  //98
		
	     num = num/10; 
		
		}
		System.out.println("the result num is " +res);
	}
}


