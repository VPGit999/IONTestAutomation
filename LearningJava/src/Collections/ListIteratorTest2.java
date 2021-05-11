package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List iterator method is used to traverse elements from forword to backward and backtoforword
		List<String> list=new ArrayList<String>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		//Now we have to listiterate the elements
		ListIterator listIterator=list.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
			
		}
		System.out.println("=============================");
		while(listIterator.hasPrevious())
		{
			System.out.println(listIterator.previous());
			
			
		}
			

	}

}
