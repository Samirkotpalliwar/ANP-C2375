package org.practicalTest.dao;


import java.util.TreeSet;

import org.practicalTest.model.Student;

public class StudentDao {

	TreeSet<Student> treeSet=new TreeSet<>();
	public String setStudent(Student student) {
		// TODO Auto-generated method stub
		treeSet.add(student);
		System.out.println(treeSet);
		return "Student added successfully";
	}
	

}
