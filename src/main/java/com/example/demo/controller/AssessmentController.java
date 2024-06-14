package com.example.demo.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Assessment;
import com.example.demo.repository.AssessmentRepository;



	@RestController

	@CrossOrigin("http://localhost:3000")


	public class AssessmentController {
		@Autowired
		private AssessmentRepository repo;
		@PostMapping("/assess")
		public ResponseEntity<Assessment> saveStudent(@RequestBody Assessment a)
		{
			Assessment a1=repo.save(a);
			return new ResponseEntity<Assessment>(a1,HttpStatus.CREATED);
		}
	}