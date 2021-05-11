package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		//Using Iterator we can traverse elements from forword to backword and backward to forword
		//Using Iterator we can traverse to list type of object
		/*Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext())
		{
			String s=iterator.next();
			System.out.println(s);
		}*/
		
		for(String s:list){
		   s.length();
		  
		}
		
		//using iterator we can traverse elements to settype of objects
		
	
		
		

	}

}
