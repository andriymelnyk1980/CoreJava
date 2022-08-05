package test;

import java.util.Scanner;

public class EvenNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
				System.out.println("Enter your number: ");
		int num = 2;
				System.out.println(num%2);
				if (num%2==0) {
					System.out.println("even number");
				}else { 
					System.out.println("Odd Number");
				}
		

	}

}