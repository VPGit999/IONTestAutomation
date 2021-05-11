package Collections;

import java.util.ArrayList;

public class ALTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		//Adding elements to array.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		
		//removing an element from index 5
		try{
		list.remove(5);
		}catch(Throwable t)
		{
		System.out.println(t.getMessage());
		}
	}

}
