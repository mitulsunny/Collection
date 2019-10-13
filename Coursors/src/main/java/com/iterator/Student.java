package com.iterator;

import java.util.HashMap;

public class Student {
	
public static HashMap<Integer, Students> getStudentInfo(){
   HashMap<Integer,Students> stu=new HashMap<Integer, Students>();
   stu.put(1, new Students("Md Obaidulla", 2, "info@osaconsulstingtech.com", 67656777));
   stu.put(2, new Students("Habib ", 1, "habib@osaconsulstingtech.com", 6776766));
   stu.put(3, new Students("Bahar", 3, "bahar@osaconsulstingtech.com", 66767667));
   stu.put(4, new Students("Shayor", 5, "shayor@osaconsulstingtech.com", 111111));
   stu.put(5, new Students("Abarar", 6, "abarar@osaconsulstingtech.com", 666544));
	return stu;
}
}
