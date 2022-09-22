package org.practicalTest.service;

import org.practicalTest.dao.StudentDao;
import org.practicalTest.model.Student;

public class StudentService {

	StudentDao studentDao=new StudentDao();
	public String setStudent(Student student) {
		// TODO Auto-generated method stub
		
		return studentDao.setStudent(student);
	}

}
