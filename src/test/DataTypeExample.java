package test;

/**
 * @author pc1
 *
 */
public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 30; 
int num2 = 20;
int sum = num1+num2; 
int mul = num1 * num2;
float div = (float) num1 / num2;

System.out.println("the sum of num1+num2 is " + sum);
System.out.println("the mul of num1 * num2 is " + mul);
System.out.println("devide two numbers " + div);

String str1 = "Clean World Green World";
System.out.println(str1);

char ch1 = str1.charAt(0);
System.out.println("first character is " +ch1);
System.out.println("length of this string is " + str1.length());

char chn = str1.charAt(str1.length() -1);
System.out.println("the last chara id "+ chn);

System.out.println("The string in upper case is " + str1.toUpperCase());
System.out.println("The string in upper case is " + str1.toLowerCase());

	}
	
}