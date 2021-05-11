package Collections;

import java.util.ArrayList;

public class ALTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList can have any number of null elements.
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(null);
		list.add(200);
		list.add(null);
		System.out.println(list);

	}

}
