package test;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "Clean World Grenn World";
    
    int count = 0;
    
    for (int index=0;index<str.length();index++) {
    	
    	char ch = str.charAt(index);
    	
    	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
    		count++;
    	}
    }
    
    System.out.println("The Vowel count is " + count  );
    
    
	}

}
