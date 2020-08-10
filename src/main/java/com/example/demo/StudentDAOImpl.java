package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Override
	public boolean saveStudent(Student student) {
		boolean res=false;
		System.out.println("Here in Repository for save student");
		return res;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delStudent(int stud_Id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
