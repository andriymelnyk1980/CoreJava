package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] array1 = {"abc","pqr","xyz","asdas","asdafa"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Leeana");
		list1.add("Priyanka");
		list1.add("Rohan");
		list1.add("Laurance");
		
		System.out.println("List id this " + list1);
	
		System.out.println("Size of Array List is" + list1.size());
		
		list1.remove(1);
		
		System.out.println("list is aftyer removing Leeana"+list1);
		System.out.println("Size of Array List is"+ list1.size());
	
		System.out.println("The data at 4th position is"+ list1.get(3));
		
		list1.set(0, "James");
		
		System.out.println("New list with James is " +list1);
		list1.add(1, "Leeana");
		System.out.println("list with Leeanna is  " + list1);
		
		Collections.sort(list1);
		System.out.println("Sorted list is  " + list1);
		
		for(int index=0;index<list1.size();index++) {
			
			System.out.println(list1.get(index));
		}
		for(String name:list1) {
			
			System.out.println(name);
		}
			
			for(int index=0;index<list1.size();index++) {
				if(list1.get(index).equals("Priyanka")){
		            System.out.println(index);
		            break;

			
			
	}

}
}
}	
