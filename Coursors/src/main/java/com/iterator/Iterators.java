package com.iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Iterators {
	public static void main(String[] args) {
		Vector<String> list=new Vector<String>();
		list.add("OSA");
		list.add("Cosnsulting");
		list.add("Tech");
		list.add("Automation");
		Enumeration<String> e=list.elements();
		//Iterator<String> it= list.iterator();
		while(e.hasMoreElements()) {
			String s=e.nextElement();
			System.out.println(s);
			
		}
		
		ArrayList<Integer> li=new ArrayList<Integer>();
		          li.add(5);
		          li.add(4);
		          li.add(3);
		          li.add(6);
		          li.add(7);
		          li.add(8);
		          Iterator<Integer> ite=li.iterator();
		          while(ite.hasNext()) {
		        	  int a=ite.next();//6
		        	  if(a==6) {
		        		  ite.remove();
		        	  }
		        	  System.out.println(a);
		          }
		          System.out.println("After remove\n");
		          Iterator<Integer> ite1=li.iterator();
		          while(ite1.hasNext()) {
		          System.out.println(ite1.next());
		          }
		          
		          
		          
		
	}

}
