package com.example.demo.controller;
import com.example.demo.model.AssessmentResult;
import com.example.demo.repository.AssessmentResultRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin("http://localhost:3000")

public class AssessmentResultController {
	@Autowired
	private AssessmentResultRepository repo;
	@PostMapping("/assessresult")
	public ResponseEntity<AssessmentResult> saveStudent(@RequestBody AssessmentResult s)
	{
		System.out.println(s+"..........Hi.................");
		AssessmentResult s1=repo.save(s);
		return new ResponseEntity<>(s1,HttpStatus.CREATED);
	}
}