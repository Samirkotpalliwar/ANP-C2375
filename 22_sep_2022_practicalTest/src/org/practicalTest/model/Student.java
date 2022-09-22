package org.practicalTest.model;
import java.util.Objects;

public class Student implements Comparable<Student>{
	
		private int studentId;
		private int studentAge;
		private String studentFirstName;
		private String studentLastName;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int studentId, int studentAge, String studentFirstName, String studentLastName) {
			super();
			this.studentId = studentId;
			this.studentAge = studentAge;
			this.studentFirstName = studentFirstName;
			this.studentLastName = studentLastName;
		}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public int getStudentAge() {
			return studentAge;
		}
		public void setStudentAge(int studentAge) {
			this.studentAge = studentAge;
		}
		public String getStudentFirstName() {
			return studentFirstName;
		}
		public void setStudentFirstName(String studentFirstName) {
			this.studentFirstName = studentFirstName;
		}
		public String getStudentLastName() {
			return studentLastName;
		}
		public void setStudentLastName(String studentLastName) {
			this.studentLastName = studentLastName;
		}
		@Override
		public String toString() {
			return "StudentView [studentId=" + studentId + ", studentAge=" + studentAge + ", studentFirstName="
					+ studentFirstName + ", studentLastName=" + studentLastName + "]";
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(studentId);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return studentId == other.studentId;
		}
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.studentId-o.studentId;
		}
		
	    
	}



