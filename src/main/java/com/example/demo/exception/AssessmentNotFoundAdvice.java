package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice

public class AssessmentNotFoundAdvice {
	@ResponseBody

	 @ExceptionHandler(AssessmentNotFoundException.class)

	 @ResponseStatus(HttpStatus.NOT_FOUND)

	 public Map<String,String> exceptionHandler(AssessmentNotFoundException exception){

	  Map<String,String> errorMap=new HashMap<>();

	  errorMap.put("errorMessage",exception.getMessage());

	  return errorMap;

	}

	}