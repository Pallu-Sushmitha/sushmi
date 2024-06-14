package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="ASSESSMENT_RESULT")
public class AssessmentResult {

 @Id

 @GeneratedValue 

 private int resultId;
 private int studentId;

 private int assessmentId;

 private int score;

 private char grade;
 private String dateTaken;
 private String comments;
 private String status;
public int getResultId() {
	return resultId;
}
public void setResultId(int resultId) {
	this.resultId = resultId;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public int getAssessmentId() {
	return assessmentId;
}
public void setAssessmentId(int assessmentId) {
	this.assessmentId = assessmentId;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public char getGrade() {
	return grade;
}
public void setGrade(char grade) {
	this.grade = grade;
}
public String getDateTaken() {
	return dateTaken;
}
public void setDateTaken(String dateTaken) {
	this.dateTaken = dateTaken;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "AssessmentResult [resultId=" + resultId + ", studentId=" + studentId + ", assessmentId=" + assessmentId
			+ ", score=" + score + ", grade=" + grade + ", dateTaken=" + dateTaken + ", comments=" + comments
			+ ", status=" + status + "]";
}
}
