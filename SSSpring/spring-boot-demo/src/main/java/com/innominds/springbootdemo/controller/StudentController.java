package com.innominds.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innominds.springbootdemo.entity.Student;

@RestController
public class StudentController{

	@GetMapping("/students")
	public List<Student> getAllStudent(){
		List<Student> list = new ArrayList<>();
		Student s1 = new Student(1,"Rajeev", 25,1000000000,"Hyderabad");
		
		list.add(s1);
		
		return list;
		
	}
}
