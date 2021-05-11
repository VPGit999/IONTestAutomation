package Collections;

import java.util.LinkedList;

public class LinkedListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> list=new LinkedList<>();
      list.add("Test1");
      list.add("Test2");
      list.add("Test3");
      list.add("Test4");
      System.out.println(list);
      String s="Test4";
     boolean contains= list.contains(s);
     if(contains)
     {
    	System.out.println( list.indexOf(s));
     }
      
      }

}
