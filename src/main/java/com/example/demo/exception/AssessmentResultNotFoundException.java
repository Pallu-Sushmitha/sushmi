package com.example.demo.exception;

public class AssessmentResultNotFoundException extends RuntimeException{

public AssessmentResultNotFoundException(Long id){

  super("Could not found the user with id "+ id);

 }

}
