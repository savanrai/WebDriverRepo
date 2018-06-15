package com.java.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> emp = new ArrayList<String>();
		
		emp.add("Szavan");
		emp.add("ASelenium");
		emp.add("AWebdriver");
		
		
		Iterator<String> itr =emp.iterator();
		
		while(itr.hasNext()){
		 String obj = itr.next();
		 System.out.println(obj);
		}
		
		Collections.sort(emp,Collections.reverseOrder());
		
		for(String m:emp){
			System.out.println(m);
		}
		
		for(int i=0;i<emp.size();i++){
			
			System.out.println(emp.get(i));
		}
	}

}
