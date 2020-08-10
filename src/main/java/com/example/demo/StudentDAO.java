package com.example.demo;

import java.util.List;

public interface StudentDAO {

	public boolean saveStudent(Student student);
	public List<Student> getStudents();
	public boolean delStudent(int stud_Id);
	public boolean updateStudent(Student student);
}
