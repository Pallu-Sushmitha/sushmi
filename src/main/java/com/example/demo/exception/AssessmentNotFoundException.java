package com.example.demo.exception;

public class AssessmentNotFoundException extends RuntimeException{

public AssessmentNotFoundException(Long id){

  super("Could not found the user with id "+id);

}
 

}