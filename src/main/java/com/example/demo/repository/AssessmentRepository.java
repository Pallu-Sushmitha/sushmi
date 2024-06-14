package com.example.demo.repository;

import com.example.demo.model.Assessment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentRepository extends JpaRepository<Assessment,Integer> {

}