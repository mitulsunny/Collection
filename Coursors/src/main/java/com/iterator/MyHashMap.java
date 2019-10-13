package com.iterator;

import java.util.HashMap;

public class MyHashMap {
public static void main(String[] args) {
//	HashMap<Integer, String> hm=new HashMap<Integer,String>();
//	hm.put(1, "OSA");
//	hm.put(6, "consulting");
//	hm.put(4, "Tech");
HashMap<Integer,Students> student=Student.getStudentInfo();
for(int i=1; i<=student.size();i++) {
String email=student.get(i).getPhone()+"   "+student.get(i).getName()+"   "+student.get(i).getEmail();
student.get(i).getName().length();
System.out.println(email);
}
}
}


// using keySet() for iteration over keys 
//for (String name : gfg.keySet())  
//    System.out.println("key: " + name); 
//  
//// using values() for iteration over keys 
//for (String url : gfg.values())  
//    System.out.println("value: " + url); 