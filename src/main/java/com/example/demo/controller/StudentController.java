package com.example.demo.controller;




import com.example.demo.model.Student;

import com.example.demo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController

@CrossOrigin("http://localhost:3000")

public class StudentController {
	@Autowired
	private StudentRepository repo;
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s)
	{
		Student s1=repo.save(s);
		return new ResponseEntity<>(s1,HttpStatus.CREATED);
	}
}