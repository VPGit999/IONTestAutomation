package Collections;

import java.util.ArrayList;

public class ALTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//As ArrayList implements RandomAccess, you can get, set, insert and remove elements of the ArrayList from  any arbitrary position.
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//get the value from index3
		System.out.println(list.get(3));
		//set the value in index1
		System.out.println(list.set(2, 200));
		//remove the value from index0
		System.out.println(list.remove(0));
		//add value to index 2
		System.out.println(list.add(1, 300));
		System.out.println(list.size());
		
		
		

	}

}
