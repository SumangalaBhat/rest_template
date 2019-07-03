package com.hcl.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.customer.entity.Student;
import com.hcl.customer.repository.CustomerRepository;

@Service
public class StudentService {
	
	@Autowired
	CustomerRepository customerrepo;

	public List<Student> getAllStudent(){
		return customerrepo.findAll();
	}

}
