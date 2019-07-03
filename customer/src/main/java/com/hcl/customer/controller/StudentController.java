package com.hcl.customer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.customer.entity.Student;
import com.hcl.customer.service.StudentService;

@RestController
public class StudentController {
	
	private static final Logger log = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("students")
	public List<Student>getAllStudent(){
		List<Student> st = studentservice.getAllStudent();
		return st;
		//log.d(st,st.toString());
		
	}

}
