package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studDAO;
	
	public boolean saveStud(Student student) {
		return studDAO.saveStudent(student);
	}
	
}
