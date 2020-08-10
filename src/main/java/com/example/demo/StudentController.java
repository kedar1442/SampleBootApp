package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4500")
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/save-student")
	public String saveStudent(Student student) {
		System.out.println("In Logs");
		studentService.saveStud(student);
		return "Kedar Hello";
	}	
	
	@GetMapping("/delete")
	public void deleteStud() {
		System.out.println("Delete Mappings gets called");
	}
	
}
