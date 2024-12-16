package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Student> sList = getStudentList();
		System.out.println("SList---> " + sList);
		Collections.sort(sList, (s1,s2)->s1.getName().compareTo(s2.getName()));
		System.out.println("After sorting SList---> " + sList);

	}

	private static List<Student> getStudentList() {
		Student s1 = new Student(12, "Milan", 60.20);
		Student s2 = new Student(13, "Barsha", 80.20);
		Student s3 = new Student(11, "Suman", 90.20);
		Student s4 = new Student(10, "Papunu", 50.20);
		List<Student> stList = new ArrayList<Student>();
		stList.add(s1);
		stList.add(s2);
		stList.add(s3);
		stList.add(s4);
		return stList;
	}
}
