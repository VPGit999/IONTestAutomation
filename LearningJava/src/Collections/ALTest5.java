package Collections;

import java.util.ArrayList;

public class ALTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		System.out.println(list);
		
		//to get the position of the index we should call position method
		
		
		System.out.println(list.indexOf("Second"));

	}

}
