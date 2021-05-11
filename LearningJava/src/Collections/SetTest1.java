package Collections;

import java.util.HashSet;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("Test1");
		set.add("Test2");
		set.add("test3");
		set.add("Test1");
		set.add(null);
		set.add(null);
		set.add(null);
		System.out.println(set);

	}

}
