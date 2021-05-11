package Collections;

import java.util.ArrayList;

public class ArrayListTOArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		System.out.println(list);
		
		//Array list to array converstion
		
		Object[] array=list.toArray();
		
		//Printing the elements of the returned array.
		
		for(Object ob:array)
		{
			System.out.println(ob);
		}
		
		
		

	}

}
