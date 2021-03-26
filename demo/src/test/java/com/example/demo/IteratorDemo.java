package com.example.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new LinkedList();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		Iterator<String> namesIterator = names.iterator();
		
		while(namesIterator.hasNext()){
			System.out.println(namesIterator.next());
		}

	}

}
